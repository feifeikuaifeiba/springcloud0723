package com.jeffrey.cloudconsumerfeignorder80.service;

import com.jeffrey.commons.entities.CommonResult;
import com.jeffrey.commons.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/28
 * @description:
 */
@Service
@FeignClient("cloud-payment-service")
@RequestMapping("/springcloud/payment8001")
public interface PaymentFeignService {

    @RequestMapping(value = "getPaymentById", method = RequestMethod.GET)
    CommonResult<Payment> getPaymentById(@RequestParam Integer id);

}
