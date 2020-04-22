package com.one.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableWebMvc
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("con.one.controller"))
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "AppInfo的Api接口",
                "我是沙雕",
                "v1.0.0",
                "暂无",
                new Contact("LonelyLeo","https://github.com/LonlyLeo/Appinfo.git","lonelyLeol@foxmail.com"),
                "暂无",
                "暂无",
                new ArrayList<>()
                );
    }
}
