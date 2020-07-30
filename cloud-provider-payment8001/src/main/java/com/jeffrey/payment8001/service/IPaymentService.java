package com.jeffrey.payment8001.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jeffrey.commons.entities.Payment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jeffrey
 * @since 2020-07-24
 */
public interface IPaymentService extends IService<Payment> {

    List<Payment> getAll();

    Payment getPaymentById(@Param("id") Integer id);

}
