package jxl.service;

import com.jxl.dcain.Product;
import jxl.service.fallback.ProductServiceFallback;
import jxl.service.fallback.ProductServiceFallbackFactory;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * product
 * Product product = restTemplate.getForObject("http://service-product/product/"+pid,Product.class);
 * @author jiangxinlin
 * @create 2021-12-23-11:58
 * ProductServiceFallback是容错类 -调用
 */

@FeignClient(value = "service-product",fallbackFactory = ProductServiceFallbackFactory.class)
public interface ProductService {
    @RequestMapping("/product/{pid}")
    Product findByPid(@PathVariable("pid") Integer pid);
}
