package com.kosasih.realitech;

import com.kosasih.realitech.RealitechApp;
import com.kosasih.realitech.config.AsyncSyncConfiguration;
import com.kosasih.realitech.config.EmbeddedElasticsearch;
import com.kosasih.realitech.config.EmbeddedKafka;
import com.kosasih.realitech.config.EmbeddedSQL;
import com.kosasih.realitech.config.TestSecurityConfiguration;
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
@SpringBootTest(classes = { RealitechApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
