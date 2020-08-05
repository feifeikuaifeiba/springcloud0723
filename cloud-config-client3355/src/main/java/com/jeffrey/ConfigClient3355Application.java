package com.jeffrey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/31
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClient3355Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3355Application.class, args);
    }
}
