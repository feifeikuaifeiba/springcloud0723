package com.jeffrey.hystrixorder80.service;

import org.springframework.stereotype.Component;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/29
 * @description:
 */
@Component
public class OrderFallbackService implements OrderHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "宕机啦/(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "宕机啦/(ㄒoㄒ)/~~";
    }
}
