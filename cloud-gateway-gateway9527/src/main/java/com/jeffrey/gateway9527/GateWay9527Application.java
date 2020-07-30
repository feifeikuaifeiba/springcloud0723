package com.jeffrey.gateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/29
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWay9527Application {
    public static void main(String[] args) {
        SpringApplication.run(GateWay9527Application.class, args);
    }
}
