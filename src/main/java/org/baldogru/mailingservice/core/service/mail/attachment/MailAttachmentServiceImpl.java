package org.baldogru.mailingservice.core.service.mail.attachment;

import org.baldogru.mailingservice.core.dto.MailAttachmentDTO;
import org.baldogru.mailingservice.core.dto.ValidationResultDTO;
import org.baldogru.mailingservice.core.service.mail.attachment.validation.MailAttachmentValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class MailAttachmentServiceImpl implements MailAttachmentService {

    private final MailAttachmentValidator mailAttachmentValidator;

    @Autowired
    public MailAttachmentServiceImpl(MailAttachmentValidator mailAttachmentValidator) {
        this.mailAttachmentValidator = mailAttachmentValidator;
    }

    @Override
    public String prepareAttachment(MailAttachmentDTO attachment) {
        ValidationResultDTO validationResultDTO = validateMailAttachment(attachment);
        return null;
    }

    @Override
    public ValidationResultDTO validateMailAttachment(MailAttachmentDTO mailAttachmentDTO) {
        return mailAttachmentValidator.validateMailAttachment(mailAttachmentDTO);
    }
}
