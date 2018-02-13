package org.baldogru.mailingservice.core.service;

import org.baldogru.mailingservice.core.dto.MailAttachment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MailAttachmentServiceImplTest {

    @Mock
    MailAttachment mailAttachment;
    @InjectMocks
    MailAttachmentServiceImpl mailAttachmentService;

    @Test
    public void testPrepareAttachment() {
    }

}