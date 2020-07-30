package com.jeffrey.payment8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/24
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.jeffrey.payment8001.mapper")
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}
