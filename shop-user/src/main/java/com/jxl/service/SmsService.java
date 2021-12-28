package com.jxl.service;

import com.jxl.dcain.Order;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * 消费消息
 *
 * @author jiangxinlin
 * @create 2021-12-28-10:09
 */
@Service
@RocketMQMessageListener(consumerGroup = "shop-user",topic = "order-topic")
public class SmsService implements RocketMQListener<Order> {
    @Override
    public void onMessage(Order order) {
        System.out.println("接收到了订单信息，短信通知，"+order);

    }
}
