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
@RestController
public class OrderController3 {
    @RequestMapping("/order/messge1")
    public String messge1(){
        return "测试高并发1";
    }
    @RequestMapping("/order/messge2")
    public String messge2(){
        return "测试高并发2";
    }
}
