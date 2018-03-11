package org.baldogru.mailingservice.core.service.mail.attachment;

import org.baldogru.mailingservice.core.dto.MailAttachmentDTO;
import org.baldogru.mailingservice.core.dto.ValidationResultDTO;

/**
 * Serwis dla klasy MailAttachmentDTO.
 */
public interface MailAttachmentService {

    /**
     * Przygotowuje załącznik do wysyłki (m.in. walidacja załącznika, zapisanie go w odpowiedniej lokalizacji)
     * i zwraca jego id.
     * @param attachment
     * @return id zapisanego załącznika
     */
    String prepareAttachment(MailAttachmentDTO attachment);

    ValidationResultDTO validateMailAttachment(MailAttachmentDTO mailAttachmentDTO);
}
