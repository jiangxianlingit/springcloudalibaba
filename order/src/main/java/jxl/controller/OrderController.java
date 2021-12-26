package jxl.controller;

import com.alibaba.fastjson.JSON;
import com.jxl.dcain.Order;
import com.jxl.dcain.Product;
import jxl.service.OrderService;
import jxl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

/**
 * 用户
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:32
 */
@RestController
public class OrderController {
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
        if (product.getPid()==-100){
            Order order = new Order();
            order.setOid(-100L);
            order.setPname("下单失败");
            return order;
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

        orderService.createOrder(order);

        System.out.println("新增订单成功啦"+JSON.toJSONString(order));

        return order;

    }
  /*  //下单ribbon负载均衡
    @RequestMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        System.out.println("下单了");

        List<ServiceInstance> instances =  discoveryClient.getInstances("service-product");
        //随机选择
        int num= new Random().nextInt(instances.size());

        ServiceInstance instance = instances.get(num);

        //调用商品微服务查询商品信息
        Product product = restTemplate.getForObject("http://service-product/product/"+pid,Product.class);
        System.out.println("查询到"+pid+"号信息"+ JSON.toJSONString(product));

        //创建订单
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");

        order.setPid(pid);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);

        orderService.createOrder(order);

        System.out.println("新增订单成功啦"+JSON.toJSONString(order));

        return order;

    }*/
   /* @RequestMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        System.out.println("下单了");

        List<ServiceInstance> instances =  discoveryClient.getInstances("service-product");
        ServiceInstance instance = instances.get(0);

        //调用商品微服务查询商品信息
        Product product = restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/product/"+pid,Product.class);
        System.out.println("查询到"+pid+"号信息"+ JSON.toJSONString(product));

        //创建订单
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");

        order.setPid(pid);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);

        orderService.createOrder(order);

        System.out.println("新增订单成功啦"+JSON.toJSONString(order));

        return order;

    }*/
 /*   @RequestMapping("/order/prod/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        System.out.println("下单了");

        //调用商品微服务查询商品信息
        Product product = restTemplate.getForObject("http://localhost:8081/product/"+pid,Product.class);
        System.out.println("查询到"+pid+"号信息"+ JSON.toJSONString(product));

        //创建订单
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");

        order.setPid(pid);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);

        orderService.createOrder(order);

        System.out.println("新增订单成功啦"+JSON.toJSONString(order));

        return order;

    }*/
}
