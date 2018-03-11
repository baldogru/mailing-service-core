package org.baldogru.mailingservice.core.service.mail.attachment.validation;

import org.baldogru.mailingservice.core.dto.MailAttachmentDTO;
import org.baldogru.mailingservice.core.dto.ValidationResultDTO;

public interface MailAttachmentValidator {

	/**
	 * Metoda służy do walidacji poprawności załącznika mailowego.
	 *
	 * @param mailAttachmentDTO
	 * @return wynik walidacji w postaci obiektu DTO zawierającego m.in. status walidacji oraz szczegóły błędów.
	 */
	ValidationResultDTO validateMailAttachment(MailAttachmentDTO mailAttachmentDTO);

}
