package com.jeffrey.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/31
 * @description:
 */
@RestController
@RefreshScope//实现刷新    需要运维curl -X POST "http://localhost:3355/actuator/refresh"
public class ConfigClient3355Controller {
    @Value("${config.info}")
    private String configInfo;

    @RequestMapping(value = "/configInfo", method = RequestMethod.GET)
    public String getConfigInfo(){
        return configInfo;
    }
}
