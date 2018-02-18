package org.baldogru.mailingservice.core.api;

import org.baldogru.mailingservice.core.dto.Mail;
import org.baldogru.mailingservice.core.dto.MailAttachmentDTO;
import org.baldogru.mailingservice.core.dto.MailSendResult;

import java.util.List;
import java.util.Map;

/**
 * To jest główne API do przygotowania i wysyłki wiadomości mailowej.
 * Dostępne tu metody pozwolą przygotować załączniki oraz wysłać gotowego maila.
 */
public interface BaldogruMailingService {

    /**
     * Wysyła maila i zwraca podsumowanie (np. status sukcesu lub błędy, które wystąpiły)
     * @param mail
     * @return
     */
    MailSendResult sendMail(Mail mail);

    /**
     * Wysyła maile i zwraca mapę z podsumowaniami (kluczem jest wysłany mail, wartością podsumowanie jego wysyłki)
     * @param mails
     * @return
     */
    Map<Mail, MailSendResult> sendMails(List<Mail> mails);

    /**
     * Przygotowuje załącznik do wysyłki (m.in. walidacja załącznika, zapisanie go w odpowiedniej lokalizacji)
     * i zwraca jego id.
     * @param attachment
     * @return
     */
    String prepareAttachment(MailAttachmentDTO attachment);

    /**
     * Przygotowuje załączniki do wysyłki i zwraca mapę z ich id (klucz - załącznik, wartość - id załącznika)
     * @param attachments
     * @return
     */
    Map<MailAttachmentDTO, String> prepareAttachments(List<MailAttachmentDTO> attachments);

}
