package com.jeffrey.hystrixorder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/28
 * @description:
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class FeignHystrixOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixOrderApplication.class, args);
    }
}
