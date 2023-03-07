package com.produtos.apirest.config;

import org.springframework.context.annotation.Bean;

import com.google.common.base.Predicate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfig {
  
  @Bean
  public Docket productApi(){
    return new Docket(DocumentationType.SWAGGER_2)
    .select()
    .apis(RequestHandlerSelectors.basePackage("com.produtos.apirest"))
    .paths(regex("/api.*"))
    .build()
    .apiInfo(metaInfo());
  }

  private Predicate<String> regex(String string) {
	// TODO Auto-generated method stub
	return null;
}

@SuppressWarnings("deprecation")
private ApiInfo metaInfo() {
     return new ApiInfo(
      "Produtos API REST",
      "API REST de cadastro de produtos.",
      "1.0",
      "Terms of Service",
      "Edio Paulo", "https://github.com/EdioPaul", "ediopaulo.ep@gmail.com");
  }
}
