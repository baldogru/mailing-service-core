package org.baldogru.mailingservice.core.service;

import org.baldogru.mailingservice.core.dto.Mail;
import org.baldogru.mailingservice.core.dto.MailSendResult;

/**
 * Serwis przeznaczony do wysyłki maili.
 */
public interface MailSendingService {

    /**
     * Wysyła maila i zwraca podsumowanie (np. status sukcesu lub błędy, które wystąpiły)
     * @param mail
     * @return
     */
    MailSendResult sendMail(Mail mail);

}
