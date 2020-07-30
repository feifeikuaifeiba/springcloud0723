package com.jeffrey.cloudconsumerfeignorder80.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/28
 * @description:
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggrtLevel(){
        return Logger.Level.FULL;
    }
}
