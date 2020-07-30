package com.jeffrey.hystrixpayment8001.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author: Jeffrey
 * @date: Created in 2020/7/28
 * @description:
 */
@Service
public class HystrixPaymentService {
    public String paymentInfo_OK(Integer id){
        return "线程池:  " + Thread.currentThread().getName() + "  paymentInfo_OK,id:  " + id + "(●ˇ∀ˇ●)";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id){
        Integer timeNumber = 3000;
        //int age = 10/0;
        try{
            TimeUnit.MILLISECONDS.sleep(timeNumber);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        return "线程池:  " + Thread.currentThread().getName() + "  paymentInfo_TimeOut,id:  " + id + "/(ㄒoㄒ)/~~耗时" + timeNumber + "秒";

    }

    //服务兜底 降级
    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池:  " + Thread.currentThread().getName() + "  8001系统忙，请稍后再试，id:  " + id + "  (ㄒoㄒ)~~";
    }

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),  //时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60"), //失败率达到多少后跳闸
            })
    public String paymentCircuitBreaker(@RequestParam("id") Integer id){
        if (id < 0){
            throw new RuntimeException("*****id 不能负数");
        }
        String serialNumber = IdUtil.simpleUUID();//等价于UUID.randomUUID().toString()
        return Thread.currentThread().getName()+"\t"+"调用成功,流水号："+serialNumber;
    }

    public String paymentCircuitBreaker_fallback(@RequestParam("id") Integer id){
        return "id 不能负数，请稍候再试,(┬＿┬)/~~     id: " +id;
    }
}
