package com.pocketxtra.pxefms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disable CSRF protection

            .authorizeHttpRequests(authorize -> authorize // Configure authorization rules for HTTP requests

                .anyRequest().permitAll() // Allow all requests without authentication. This means no security restrictions on any endpoints
            );
        return http.build();
    }
}
