package org.baldogru.mailingservice.core.service;

import org.baldogru.mailingservice.core.dto.MailAttachment;

/**
 * Serwis dla klasy MailAttachment.
 */
public interface MailAttachmentService {

    /**
     * Przygotowuje załącznik do wysyłki (m.in. walidacja załącznika, zapisanie go w odpowiedniej lokalizacji)
     * i zwraca jego id.
     * @param attachment
     * @return
     */
    String prepareAttachment(MailAttachment attachment);
}
