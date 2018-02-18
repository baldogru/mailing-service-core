package org.baldogru.mailingservice.core.service;

import org.baldogru.mailingservice.core.dto.Mail;
import org.baldogru.mailingservice.core.dto.MailSendResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class MailSendingServiceImplTest {

    @Mock
    private Mail mail;
    @Mock
    private MailSendResult mailSendResult;
    @InjectMocks
    private MailSendingServiceImpl mailSendingService;

    @Test
    public void testSendMail() {
        MailSendResult result = mailSendingService.sendMail(mail);
    }

}