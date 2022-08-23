package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SegurosDoctorStrangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegurosDoctorStrangeApplication.class, args);
	}
	
	@Bean
	public Docket api(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.build()
				.apiInfo(apiDetails());
		
		
	}

	private ApiInfo apiDetails() {
		// TODO Auto-generated method stub
		return new ApiInfoBuilder()
				.title("Seguros Doctor Strange")
				.description("la api controla lo que son 3 microcrontoladores")
				.build() ;
	}

}
