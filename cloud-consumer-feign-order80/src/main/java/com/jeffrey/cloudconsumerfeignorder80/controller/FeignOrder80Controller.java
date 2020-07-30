package com.jeffrey.cloudconsumerfeignorder80.controller;

import com.jeffrey.cloudconsumerfeignorder80.service.PaymentFeignService;
import com.jeffrey.commons.entities.CommonResult;
import com.jeffrey.commons.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/27
 * @description:
 */
@RestController
@Slf4j
@RequestMapping("/feignOrder80")
public class FeignOrder80Controller {

    @Autowired
    PaymentFeignService paymentFeignService;

    @RequestMapping("/getPaymentById")
    public CommonResult<Payment> getPaymentById(@RequestParam Integer id){
        return paymentFeignService.getPaymentById(id);
    }

}
