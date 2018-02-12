package org.baldogru.mailingservice.core.api;

import org.baldogru.mailingservice.core.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class BaldogruMailingServiceImplTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void sendMail() throws Exception {
    }

    @Test
    public void sendMails() throws Exception {
    }

    @Test
    public void prepareAttachment() throws Exception {
    }

    @Test
    public void prepareAttachments() throws Exception {
    }

}