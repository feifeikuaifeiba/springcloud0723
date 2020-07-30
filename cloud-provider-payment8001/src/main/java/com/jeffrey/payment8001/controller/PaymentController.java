package com.jeffrey.payment8001.controller;

import com.jeffrey.commons.entities.CommonResult;
import com.jeffrey.commons.entities.Payment;
import com.jeffrey.payment8001.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jeffrey
 * @since 2020-07-24
 */
@RestController
//@RequestMapping("/springcloud/payment8001")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private IPaymentService iPaymentService;

    @RequestMapping(value = "/payment/getAll", method = RequestMethod.GET)
    public List<Payment> getAll(){
        return iPaymentService.getAll();
    }

    @RequestMapping(value = "/payment/getPaymentById", method = RequestMethod.GET)
    public CommonResult<Payment> getPaymentById(@RequestParam Integer id){
        Payment payment = iPaymentService.getPaymentById(id);
        if(payment != null)
            return new CommonResult<Payment>(200, "查询成功，serverport:" + serverPort, payment);
        else
            return new CommonResult<Payment>(200, "查询成功，serverport:" + serverPort, payment);
    }

    @RequestMapping(value = "/payment/lb", method = RequestMethod.GET)
    public String getPaymentLB(){
        return serverPort;
    }
}

