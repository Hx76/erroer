package com.example.erroer.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class GlobalException2 {
//    @Bean
//    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
//        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
//        Properties properties = new Properties();
//        //参数一是错误类型全称，第二个参数是视图名称
//        properties.put("java.lang.NullPointerException","error3");
//        resolver.setExceptionMappings(properties);
//        return resolver;
//    }
}
