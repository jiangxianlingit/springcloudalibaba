package jxl.controller;

import com.alibaba.fastjson.JSON;
import com.jxl.dcain.Product;
import jdk.nashorn.internal.runtime.logging.Logger;
import jxl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/product/api001/demo1")
    public String demo1() {
        return "demo";
    }

    @RequestMapping("/product/api001/demo2")
    public String demo2() {
        return "demo2";
    }

    @RequestMapping("/product/api002/demo1")
    public String demo3() {
        return "demo3";
    }

    @RequestMapping("/product/api002/demo2")
    public String demo4() {
        return "demo4";
    }


    //新增一笔定单，先查询商品，在根据信息新增
    @RequestMapping("/product/{pid}")
    public Product product(@PathVariable("pid") Integer pid){
        System.out.println("查询订单信息");
        Product product = productService.findByid(pid);
        System.out.println("查询成功"+ JSON.toJSONString(product));
        return product;
    }
}
