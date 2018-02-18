package org.baldogru.mailingservice.core.dto;

import java.io.File;
import java.time.LocalDateTime;

public final class MailAttachmentDTOBuilder {
    private Long id;
    private String name;
    private String extension;
    private Long sizeInBytes;
    private LocalDateTime creationDate;
    private File attachmentFile;

    public MailAttachmentDTOBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public MailAttachmentDTOBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MailAttachmentDTOBuilder setExtension(String extension) {
        this.extension = extension;
        return this;
    }

    public MailAttachmentDTOBuilder setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    public MailAttachmentDTOBuilder setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public MailAttachmentDTOBuilder setAttachmentFile(File attachmentFile) {
        this.attachmentFile = attachmentFile;
        return this;
    }

    public MailAttachmentDTO build() {
        return new MailAttachmentDTO(id, name, extension, sizeInBytes, creationDate, attachmentFile);
    }
}