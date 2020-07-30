package com.jeffrey.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/27
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8006Appication {
    public static void main(String[] args) {
        SpringApplication.run(Payment8006Appication.class, args);
    }
}
