package com.hankal.miaosha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication //same as @Configuration+@EnableAutoConfiguration+@ComponentScan
@EnableSwagger2 // //TODO：【swagger】 启动swagger注解
public class MiaoshaApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MiaoshaApplication.class);
    }
}
