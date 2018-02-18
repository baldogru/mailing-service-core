package org.baldogru.mailingservice.core.service;

import org.baldogru.mailingservice.core.dto.MailAttachmentDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class MailAttachmentServiceImplTest {

    @Mock
    MailAttachmentDTO mailAttachmentDTO;
    @InjectMocks
    MailAttachmentServiceImpl mailAttachmentService;

    @Test
    public void testPrepareAttachment() {
        String result = mailAttachmentService.prepareAttachment(mailAttachmentDTO);

        assertNull(result);
    }

}