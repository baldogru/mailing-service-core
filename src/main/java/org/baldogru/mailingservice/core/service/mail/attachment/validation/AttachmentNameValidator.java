package org.baldogru.mailingservice.core.service.mail.attachment.validation;

import org.baldogru.mailingservice.core.dto.MailAttachmentDTO;
import org.baldogru.mailingservice.core.dto.ValidationResultDTO;

public interface AttachmentNameValidator {

	ValidationResultDTO validateAttachmentName(MailAttachmentDTO mailAttachmentDTO);

}
