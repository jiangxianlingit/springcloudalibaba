package jxl.service;

import com.alibaba.fastjson.JSON;
import com.jxl.dcain.Order;
import com.jxl.dcain.Product;
import io.seata.spring.annotation.GlobalTransactional;
import jxl.dao.OrderDao;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * imp
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:35
 */
@Service
public class OrderServiceImp5{
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductService productService;
    @Autowired
    private RocketMQTemplate rocketMQTemplate;
//    @GlobalTransactional
    public Order createOrder(Integer pid) {
        System.out.println("下单了");
        //调用商品微服务查询商品信息
        Product product = productService.findByPid(pid);
        System.out.println("查询到"+pid+"号信息"+ JSON.toJSONString(product));

        //创建订单
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");

        order.setPid(pid);
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);

        orderDao.save(order);
//        int num = 1/0;
//        System.out.println(num);

        System.out.println("新增订单成功啦"+JSON.toJSONString(order));
        //扣库存
        productService.reduceInventory(pid, order.getNumber());
        //向mq发消息
        rocketMQTemplate.convertAndSend("order-topic",order);
        return order;
    }

}
