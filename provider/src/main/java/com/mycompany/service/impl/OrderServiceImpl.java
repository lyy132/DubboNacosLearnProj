package com.mycompany.service.impl;

import com.mycompany.common.entity.Order;
import com.mycompany.common.service.OrderService;
import com.mycompany.config.TextConfig;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@DubboService
public class OrderServiceImpl implements OrderService {

    @Resource
    private TextConfig textConfig;

    @Override
    public Order createOrder() {
        Order order = new Order();
        String str = textConfig.getReminder()+"创建下单信息";
        order.setOrderInfo(str);
        order.setId(12);
        order.setUserId(1);
        return order;
    }
}
