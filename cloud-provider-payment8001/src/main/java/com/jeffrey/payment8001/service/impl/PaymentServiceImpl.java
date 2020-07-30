package com.jeffrey.payment8001.service.impl;

import com.jeffrey.commons.entities.Payment;
import com.jeffrey.payment8001.mapper.PaymentMapper;
import com.jeffrey.payment8001.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jeffrey
 * @since 2020-07-24
 */
@Service
@Transactional
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public List<Payment> getAll() {
        return paymentMapper.selectList(null);
    }

    @Override
    public Payment getPaymentById(@Param("id") Integer id) {
        return paymentMapper.selectById(id);
    }

}
