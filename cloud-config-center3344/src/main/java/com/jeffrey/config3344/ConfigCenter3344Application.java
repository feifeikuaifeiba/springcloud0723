package com.jeffrey.config3344;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/30
 * @description:
 */
@SpringBootApplication
@EnableConfigServer  //配置中心
public class ConfigCenter3344Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenter3344Application.class, args);

    }
}
