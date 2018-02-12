package org.baldogru.mailingservice.core.api;

import org.baldogru.mailingservice.core.dto.Mail;
import org.baldogru.mailingservice.core.dto.MailAttachment;
import org.baldogru.mailingservice.core.dto.MailSendResult;
import org.baldogru.mailingservice.core.service.MailAttachmentService;
import org.baldogru.mailingservice.core.service.MailSendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public final class BaldogruMailingServiceImpl implements BaldogruMailingService {

    private final MailAttachmentService mailAttachmentService;
    private final MailSendingService mailSendingService;

    @Autowired
    public BaldogruMailingServiceImpl(MailAttachmentService mailAttachmentService, MailSendingService mailSendingService) {
        this.mailAttachmentService = mailAttachmentService;
        this.mailSendingService = mailSendingService;
    }

    public MailSendResult sendMail(Mail mail) {
        return mailSendingService.sendMail(mail);
    }

    public Map<Mail, MailSendResult> sendMails(Mail... mails) {
        return null;
    }

    public String prepareAttachment(MailAttachment attachment) {
        return mailAttachmentService.prepareAttachment(attachment);
    }

    public Map<MailAttachment, String> prepareAttachments(MailAttachment... attachments) {
        return null;
    }
}
