package jxl.controller;

import com.alibaba.fastjson.JSON;
import com.jxl.dcain.Order;
import com.jxl.dcain.Product;
import jxl.service.OrderService;
import jxl.service.OrderServiceImp5;
import jxl.service.ProductService;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:32
 */
@RestController
public class OrderController5 {
    @Autowired
    private OrderServiceImp5 orderService;


    //下单feign负载均衡
    @RequestMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        return  orderService.createOrder(pid);

    }

}
