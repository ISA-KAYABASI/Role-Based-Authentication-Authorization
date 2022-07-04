package com.isakayabasi.springsecuritybasicauthenticationauthorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityBasicAuthenticationAuthorizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityBasicAuthenticationAuthorizationApplication.class, args);
    }

}
