package es.upm.miw.apaw_microservice_themes_suggestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})// Not: /error
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // mvn clean spring-boot:run
    }

}
