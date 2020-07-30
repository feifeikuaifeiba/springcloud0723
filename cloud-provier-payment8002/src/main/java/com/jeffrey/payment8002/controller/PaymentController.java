package com.jeffrey.payment8002.controller;

import com.jeffrey.commons.entities.CommonResult;
import com.jeffrey.commons.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/30
 * @description:
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/getPaymentById", method = RequestMethod.GET)
    public CommonResult<Payment> getPaymentById(@RequestParam Integer id){
        return null;
    }

    @RequestMapping(value = "/payment/lb", method = RequestMethod.GET)
    public String getPaymentLB(){
        return serverPort;
    }
}
