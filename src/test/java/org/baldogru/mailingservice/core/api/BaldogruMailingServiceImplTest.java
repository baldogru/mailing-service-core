package org.baldogru.mailingservice.core.api;

import org.baldogru.mailingservice.core.dto.Mail;
import org.baldogru.mailingservice.core.dto.MailSendResult;
import org.baldogru.mailingservice.core.service.MailAttachmentService;
import org.baldogru.mailingservice.core.service.MailSendingService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class BaldogruMailingServiceImplTest {

    //Standardowo mockujesz wszystko co będzie wstrzykiwane do klasy plus to, co Ci się przyda w metodach.
    //Te wykorzystywane w metodach można też sobie mockować bezpośrednio w metodach, ale uważam, że to tylko niepotrzebny,
    //dodatkowy kod - tu wystarczy adnotacja i po sprawie.
    @Mock
    private MailAttachmentService mailAttachmentService;
    @Mock
    private MailSendingService mailSendingService;
    @Mock
    private Mail mail;
    @Mock
    private MailSendResult mailSendResult;
    //InjectMocks służy do wstrzykiwania mocków oraz inicjalizacji obiektu, który będziemy testować.
    @InjectMocks
    private BaldogruMailingServiceImpl baldogruMailingService;

    @Test
    public void testSendMail() {
        //nie interesuje nas co tam będzie zwracane, testujemy tylko poprawność metody
        when(mailSendingService.sendMail(mail)).thenReturn(mailSendResult);

        MailSendResult result = baldogruMailingService.sendMail(mail);

        assertNotNull(result);
        //weryfikacja, czy oczekiwana metoda została użyta dokladnie jeden raz
        verify(mailSendingService, times(1)).sendMail(mail);
    }

    @Test
    public void testSendMails() {
        //Lista mocków, tak jak wyżej, nie jest ważne co przekazujemy i co zwraca serwis wywoływany, sprawdzamy tylko
        //czy nasza metoda wywołuje ten serwis i czy działa poprawnie.
        List<Mail> mails = new ArrayList<>();
        mails.add(mock(Mail.class));
        mails.add(mock(Mail.class));
        mails.add(mock(Mail.class));
        mails.add(mock(Mail.class));
        when(mailSendingService.sendMail(any(Mail.class))).thenReturn(mock(MailSendResult.class));

        Map<Mail, MailSendResult> result = baldogruMailingService.sendMails(mails);
        int mailsSize = mails.size();

        assertNotNull(result);
        //weryfikacja, czy na wyjściu mamy tyle samo elementów co na wejściu, czyli czy dla każdego maila mamy odpowiedź
        assertEquals(result.size(), mailsSize);
        //weryfikacja, czy pętelka rzeczywiście wywołała porządaną metodę odpowiednią liczbę razy
        verify(mailSendingService, times(mailsSize)).sendMail(any(Mail.class));
    }

    @Test
    public void testPrepareAttachment() {
        //TODO dokończyć
    }

    @Test
    public void testPrepareAttachments() {
        //TODO dokończyć
    }
}