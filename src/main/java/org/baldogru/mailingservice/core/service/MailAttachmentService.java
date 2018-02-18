package org.baldogru.mailingservice.core.service;

import org.baldogru.mailingservice.core.dto.MailAttachmentDTO;

/**
 * Serwis dla klasy MailAttachmentDTO.
 */
public interface MailAttachmentService {

    /**
     * Przygotowuje załącznik do wysyłki (m.in. walidacja załącznika, zapisanie go w odpowiedniej lokalizacji)
     * i zwraca jego id.
     * @param attachment
     * @return
     */
    String prepareAttachment(MailAttachmentDTO attachment);
}
