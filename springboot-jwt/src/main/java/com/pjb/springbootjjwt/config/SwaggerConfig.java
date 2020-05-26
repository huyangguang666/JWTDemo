package com.pjb.springbootjjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangguang.hu
 * @create 2020-05-22 14:25
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docketCreate() {
        ParameterBuilder pb =new ParameterBuilder();
        List<Parameter> parameters = new ArrayList<>();
        pb.name("token").description("token授权")
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false)
                .build();
        parameters.add(pb.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pjb.springbootjjwt.controller"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(parameters)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Ian Hu", "https://github.com/huyangguang666", "861279237@qq.com");
        return new ApiInfoBuilder()
                .title("胡炀广的小demo")
                .description("jwt")
                .contact(contact)
                .version("v1.0")
                .build();
    }
}
