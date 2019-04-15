package com.lh.aigou_common_parent.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author lzl
 * @date 2018/4/6
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    @DependsOn("jacksonObjectMapper")
    public Docket createRestApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(
                        new ApiInfoBuilder()
                                .title("来自lzl的zyzwzx说明")
                                .description("api根地址：http://localhost:8088/")
                                .version("1.0")
                                .build()
                )
                .groupName("myself")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mcrt.zyzwzx.controller"))
                .paths(PathSelectors.any())
                .build()
                .directModelSubstitute(LocalDate.class, String.class)
                .directModelSubstitute(LocalTime.class, String.class)
                .directModelSubstitute(LocalDateTime.class, String.class);
    }
}
