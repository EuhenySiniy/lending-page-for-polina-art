package com.yevhensynii.polinka.art.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SpringdocConfig {
  @Bean
  public OpenAPI baseOpenAPI() {
    return new OpenAPI().info(new Info().title("Polinka art lending").version("1.0.0").description("Api for lending"));
  }
}
