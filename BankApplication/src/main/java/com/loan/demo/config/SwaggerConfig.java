package com.loan.demo.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	public Docket postsApi() {

		return new Docket(DocumentationType.SWAGGER_2).groupName("BankApplication").
				apiInfo(ApiInfo()).select().paths(regex("/com*.")).build();
	}
	private ApiInfo ApiInfo() {
		return new ApiInfoBuilder().title("Bank Controller")
				.description("Sample Documentation for our Bank Rest API").build();
	}
}

