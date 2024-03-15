package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservices REST API Documentation",
                description = "EasyBank Accounts microservices REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Ravikumar Ede",
                        email = "ravi.ede@gmail.com",
                        url = "https://eazybytes.com"
                ),
                license = @License(
                        name = "GNU License 2.0",
                        url = "https://eazybytes.com"
                )
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
