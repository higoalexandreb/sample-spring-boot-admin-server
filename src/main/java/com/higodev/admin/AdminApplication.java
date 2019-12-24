package com.higodev.admin;

import com.higodev.admin.security.WebSecurityConfig;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(excludeName = {"WebSecurityConfig"})
@EnableAdminServer
public class AdminApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AdminApplication.class)
                .web(WebApplicationType.REACTIVE)
                .run(args);
    }
}
