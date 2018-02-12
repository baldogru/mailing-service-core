package org.baldogru.mailingservice.core.service;

import org.baldogru.mailingservice.core.AppConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class MailAttachmentServiceImplTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void prepareAttachment() throws Exception {
    }

}