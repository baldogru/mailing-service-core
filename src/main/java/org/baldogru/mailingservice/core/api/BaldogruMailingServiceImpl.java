package org.baldogru.mailingservice.core.api;

import org.baldogru.mailingservice.core.dto.Mail;
import org.baldogru.mailingservice.core.dto.MailAttachment;
import org.baldogru.mailingservice.core.dto.MailSendResult;
import org.baldogru.mailingservice.core.service.MailAttachmentService;
import org.baldogru.mailingservice.core.service.MailSendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public final class BaldogruMailingServiceImpl implements BaldogruMailingService {

    private final MailAttachmentService mailAttachmentService;
    private final MailSendingService mailSendingService;

    @Autowired
    public BaldogruMailingServiceImpl(MailAttachmentService mailAttachmentService, MailSendingService mailSendingService) {
        this.mailAttachmentService = mailAttachmentService;
        this.mailSendingService = mailSendingService;
    }


    @Override
    public MailSendResult sendMail(Mail mail) {
        return mailSendingService.sendMail(mail);
    }

    @Override
    public Map<Mail, MailSendResult> sendMails(List<Mail> mails) {
        //Lamby powinny byc jednolinijkowe. Jeżeli musimy użyć nawiasów wąsatych w lambdzie to znaczy,
        //że źle z nich korzystamy. One mają poprawiać czytelność kodu, tymczasem tworzenie wielolinijkowych
        //lambd pogarsza czytelność. Więcej informacji w linku poniżej:
        //https://www.ibm.com/developerworks/library/j-java8idioms6/index.html
        return mails
                .stream()
                .collect(Collectors.toMap(Function.identity(), this::sendMail));
    }

    @Override
    public String prepareAttachment(MailAttachment attachment) {
        return mailAttachmentService.prepareAttachment(attachment);
    }

    @Override
    public Map<MailAttachment, String> prepareAttachments(List<MailAttachment> attachments) {
        //TODO zrefaktorować na wzór sendMails. Sprawdzić czy test jednostkowy dalej działa poprawnie.
        Map<MailAttachment, String> mailAttachmentMap = new HashMap<>();
        attachments.forEach((attachment) -> {
            String result = prepareAttachment(attachment);
            mailAttachmentMap.put(attachment, result);
        });
        return mailAttachmentMap;
    }

}
