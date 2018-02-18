package org.baldogru.mailingservice.core.dto;

import java.io.File;
import java.time.LocalDateTime;

public final class MailAttachmentBuilder {
    private Long id;
    private String name;
    private String extension;
    private Long sizeInBytes;
    private LocalDateTime creationDate;
    private File attachmentFile;

    public MailAttachmentBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public MailAttachmentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MailAttachmentBuilder setExtension(String extension) {
        this.extension = extension;
        return this;
    }

    public MailAttachmentBuilder setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }

    public MailAttachmentBuilder setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public MailAttachmentBuilder setAttachmentFile(File attachmentFile) {
        this.attachmentFile = attachmentFile;
        return this;
    }

    public MailAttachment build() {
        return new MailAttachment(id, name, extension, sizeInBytes, creationDate, attachmentFile);
    }
}