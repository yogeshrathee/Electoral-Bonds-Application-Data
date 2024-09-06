package org.yogesh.electoral.bonds.electoralbondsapplication.Config;

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
                        .title("Electoral Bond Application")
                        .description("Restful APIs")
                        .contact(new Contact()
                                .name("Developer")
                                .url("https://yogeshrathee.github.io/combined-portflio/")));
    }
}