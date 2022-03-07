package org.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket apiDoGen() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
			    .apis(RequestHandlerSelectors.basePackage("org.project.rest"))
					      .paths(PathSelectors.any())
					      .build();
}
}