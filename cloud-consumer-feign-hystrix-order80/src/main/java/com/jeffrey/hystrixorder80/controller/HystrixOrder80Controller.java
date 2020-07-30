package com.jeffrey.hystrixorder80.controller;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.jeffrey.hystrixorder80.service.OrderHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/28
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("/order/hystrix")
@DefaultProperties(defaultFallback = "orderGlobalFallback")
public class HystrixOrder80Controller {

    @Autowired
    private OrderHystrixService orderHystrixService;

    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    //@HystrixCommand(fallbackMethod = "paymentInfo_ConsumerTimeOutHandler", commandProperties = {
    //        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    //})
    //@HystrixCommand
    public String paymentInfo_OK(@RequestParam("id") Integer id){
        return orderHystrixService.paymentInfo_OK(id);
    }

    @RequestMapping(value = "/timeout", method = RequestMethod.GET)
    //@HystrixCommand(fallbackMethod = "paymentInfo_ConsumerTimeOutHandler", commandProperties = {
    //        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    //})
    @HystrixCommand
    public String paymentInfo_TimeOut(@RequestParam("id") Integer id) {
        return orderHystrixService.paymentInfo_TimeOut(id);
    }

    //服务兜底 降级
    public String paymentInfo_ConsumerTimeOutHandler(@RequestParam("id") Integer id){
        return "80系统忙，请稍后再试，id:  " + id + "  (ㄒoㄒ)~~";
    }

    //全局fallback
    public String orderGlobalFallback(){
        return "Global异常处理信息，请稍后再试，/(ㄒoㄒ)/~~";
    }
}
