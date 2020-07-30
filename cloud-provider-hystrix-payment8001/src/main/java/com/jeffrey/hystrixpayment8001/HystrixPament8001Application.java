package com.jeffrey.hystrixpayment8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/28
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class HystrixPament8001Application {
    public static void main(String[] args) {
        SpringApplication.run(HystrixPament8001Application.class, args);
    }
}
