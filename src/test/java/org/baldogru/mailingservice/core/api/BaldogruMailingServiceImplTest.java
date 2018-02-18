package org.baldogru.mailingservice.core.api;

import org.baldogru.mailingservice.core.dto.Mail;
import org.baldogru.mailingservice.core.dto.MailAttachmentDTO;
import org.baldogru.mailingservice.core.dto.MailSendResult;
import org.baldogru.mailingservice.core.service.MailAttachmentService;
import org.baldogru.mailingservice.core.service.MailSendingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BaldogruMailingServiceImplTest {

    @Mock
    private MailAttachmentService mailAttachmentService;
    @Mock
    private MailSendingService mailSendingService;
    @Mock
    private Mail mail;
    @Mock
    private MailSendResult mailSendResult;
    @Mock
    private MailAttachmentDTO mailAttachmentDTO;
    @InjectMocks
    private BaldogruMailingServiceImpl baldogruMailingService;

    @Test
    public void testSendMail() {
        when(mailSendingService.sendMail(mail)).thenReturn(mailSendResult);

        MailSendResult result = baldogruMailingService.sendMail(mail);

        assertNotNull(result);
        verify(mailSendingService, times(1)).sendMail(mail);
    }

    @Test
    public void testSendMails() {
        List<Mail> mails = new ArrayList<>();
        mails.add(mock(Mail.class));
        mails.add(mock(Mail.class));
        mails.add(mock(Mail.class));
        mails.add(mock(Mail.class));
        when(mailSendingService.sendMail(any(Mail.class))).thenReturn(mock(MailSendResult.class));

        Map<Mail, MailSendResult> result = baldogruMailingService.sendMails(mails);
        int mailsSize = mails.size();

        assertNotNull(result);
        assertEquals(result.size(), mailsSize);
        verify(mailSendingService, times(mailsSize)).sendMail(any(Mail.class));
    }

    @Test
    public void testPrepareAttachment() {
        when(mailAttachmentService.prepareAttachment(mailAttachmentDTO)).thenReturn(anyString());

        String result = baldogruMailingService.prepareAttachment(mailAttachmentDTO);

        assertNotNull(result);
        verify(mailAttachmentService, times(1)).prepareAttachment(mailAttachmentDTO);
    }

    @Test
    public void testPrepareAttachments() {
        List<MailAttachmentDTO> attachments = new ArrayList<>();
        attachments.add(mock(MailAttachmentDTO.class));
        attachments.add(mock(MailAttachmentDTO.class));
        attachments.add(mock(MailAttachmentDTO.class));
        when(mailAttachmentService.prepareAttachment(any(MailAttachmentDTO.class))).thenReturn(anyString());

        Map<MailAttachmentDTO, String> result = baldogruMailingService.prepareAttachments(attachments);
        int attachmentsSize = attachments.size();

        assertNotNull(result);
        assertEquals(result.size(), attachmentsSize);
        verify(mailAttachmentService, times(attachmentsSize)).prepareAttachment(any(MailAttachmentDTO.class));
    }
}