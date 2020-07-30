package com.jeffrey.hystrixorder80.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/28
 * @description:
 */
@Service
@FeignClient(value = "cloud-provider-hystrix-payment8001", fallback = OrderFallbackService.class)
//@RequestMapping("/payment/hystrix")
public interface OrderHystrixService {
    @RequestMapping(value = "/payment/hystrix/ok", method = RequestMethod.GET)
    String paymentInfo_OK(@RequestParam("id") Integer id);

    @RequestMapping(value = "/payment/hystrix/timeout", method = RequestMethod.GET)
    String paymentInfo_TimeOut(@RequestParam("id") Integer id);
}
