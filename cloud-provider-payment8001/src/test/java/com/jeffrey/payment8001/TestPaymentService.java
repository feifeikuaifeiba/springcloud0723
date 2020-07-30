package com.jeffrey.payment8001;

import com.jeffrey.commons.entities.Payment;
import com.jeffrey.payment8001.service.IPaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/24
 * @description:
 */
@SpringBootTest
public class TestPaymentService {

    @Autowired
    IPaymentService iPaymentService;

    @Test
    public void getAll(){
        List<Payment> payments = iPaymentService.getAll();
        payments.forEach(payment -> System.out.println("payment = " + payment));
    }
}
