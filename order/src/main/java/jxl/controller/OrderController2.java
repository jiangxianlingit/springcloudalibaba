package jxl.controller;

import com.alibaba.fastjson.JSON;
import com.jxl.dcain.Order;
import com.jxl.dcain.Product;
import jxl.service.OrderService;
import jxl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test测试高并发
 *
 *
 * @author jiangxinlin
 * @create 2021-12-23-14:21
 */
//@RestController
public class OrderController2 {
    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;
    //下单feign负载均衡
    @RequestMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        System.out.println("下单了");
        //调用商品微服务查询商品信息
        Product product = productService.findByPid(pid);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("查询到"+pid+"号信息"+ JSON.toJSONString(product));

        //创建订单
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");

        order.setPid(pid);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);

//        orderService.createOrder(order);

        System.out.println("新增订单成功啦"+ JSON.toJSONString(order));

        return order;

    }
    @RequestMapping("/order/messge")
    public String messge(){
        return "测试高并发";
    }
}
