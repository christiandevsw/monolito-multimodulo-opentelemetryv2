package com.dojo.app.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Mi API Spring Boot")
                        .version("1.0.0")
                        .description("Documentación de los endpoints de mi aplicación")
                        .contact(new Contact()
                                .name("Tu Nombre")
                                .email("tu@email.com")));
    }
}
