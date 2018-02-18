package org.baldogru.mailingservice.core.dto;


import lombok.*;
import org.baldogru.mailingservice.core.annotations.Immutable;

import java.io.File;
import java.time.LocalDateTime;

/**
 * Klasa zawierająca szczegóły załącznika mailowego.
 */
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@Immutable
public final class MailAttachment {
    private final Long id;
    private final String name;
    private final String extension;
    private final Long sizeInBytes;
    private final LocalDateTime creationDate;
    private final File attachmentFile;

}
