package org.operaton.bpm.extension.keycloak.showcase;

import org.operaton.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.operaton.bpm.spring.boot.starter.event.PostDeployEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

/**
 * The OPERATON Showcase Spring Boot application.
 */
@SpringBootApplication
@EnableProcessApplication("operaton.showcase")
public class OperatonApplication {

	/** This class' logger. */
	private static final Logger LOG = LoggerFactory.getLogger(OperatonApplication.class);
	
	/**
	 * Post deployment work.
	 * @param event
	 */
	@EventListener
	public void onPostDeploy(PostDeployEvent event) {
		LOG.info("========================================");
		LOG.info("Successfully started OPERATON Showcase");
		LOG.info("========================================");
	}
	
	/**
	 * Starts this application.
	 * @param args arguments
	 */
	public static void main(String... args) {
		SpringApplication.run(OperatonApplication.class, args);
	}
	
}