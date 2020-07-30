package com.jeffrey.hystrixpayment8001.controller;

import cn.hutool.core.util.IdUtil;
import com.jeffrey.hystrixpayment8001.service.HystrixPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
//@RequestMapping("/payment/hystrix")
public class HystrixPayment8001Controller {
    @Autowired
    private HystrixPaymentService hystrixPaymentService;

    @Value("${server.port}")
    private String serverPort;



    @RequestMapping(value = "/payment/hystrix/ok", method = RequestMethod.GET)
    public String paymentInfo_OK(@RequestParam("id") Integer id){
        String result = hystrixPaymentService.paymentInfo_OK(id);
        log.info("*****result: " + result);
        return result;
    }

    @RequestMapping(value = "/payment/hystrix/timeout", method = RequestMethod.GET)
    public String paymentInfo_TimeOut(@RequestParam("id") Integer id){
        String result = hystrixPaymentService.paymentInfo_TimeOut(id);
        log.info("*****result: " + result);
        return result;
    }

    //服务熔断
    @RequestMapping(value = "/payment/circuit", method = RequestMethod.GET)
    public String paymentCircuitBreaker(@RequestParam("id") Integer id) {
        String result = hystrixPaymentService.paymentCircuitBreaker(id);
        log.info("*****result: " + result);
        return result;
    }
}
