package org.baldogru.mailingservice.core.dto;


import lombok.*;

import java.io.File;
import java.time.LocalDateTime;

/**
 * Klasa zawierająca szczegóły załącznika mailowego.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Getter
public final class MailAttachment {
    private final Long id;
    private final String name;
    private final String extension;
    private final Long size;
    private final LocalDateTime createDate;
    private final File attachmentFile;

}
