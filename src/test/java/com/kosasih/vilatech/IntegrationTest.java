package com.kosasih.vilatech;

import com.kosasih.vilatech.VilatechApp;
import com.kosasih.vilatech.config.AsyncSyncConfiguration;
import com.kosasih.vilatech.config.EmbeddedElasticsearch;
import com.kosasih.vilatech.config.EmbeddedKafka;
import com.kosasih.vilatech.config.EmbeddedSQL;
import com.kosasih.vilatech.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { VilatechApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
