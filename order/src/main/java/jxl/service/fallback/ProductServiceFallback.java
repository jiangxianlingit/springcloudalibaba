/*
package jxl.service.fallback;

import com.jxl.dcain.Product;
import jxl.service.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

*/
/**
 * back
 * 容错类 实现feign所在的接口，实现接口所有方法，出现问题时执行容错逻辑
 * @author jiangxinlin
 * @create 2021-12-23-17:07
 *//*

@Service
public class ProductServiceFallback implements ProductService {


    @Override
    public Product findByPid(Integer pid) {
        //容错逻辑
        Product product =  new Product();
        product.setPid(-100);
        product.setPname("远程调用出现异常,进入容错");
        return product;
    }
}
*/
