/*
package jxl.service.fallback;

import com.jxl.dcain.Product;
import feign.hystrix.FallbackFactory;
import jxl.service.ProductService;
import org.springframework.stereotype.Service;

*/
/**
 * 容错类，实现容错
 *
 * @author jiangxinlin
 * @create 2021-12-23-17:24
 *//*

@Service
public class ProductServiceFallbackFactory implements FallbackFactory<ProductService> {
//Throwable在feign调用时产生的异常
    @Override
    public ProductService create(Throwable throwable) {
        return new ProductService() {
            @Override
            public Product findByPid(Integer pid) {
                System.out.println(throwable);
                Product product =  new Product();
                product.setPid(-100);
                product.setPname("远程调用出现异常,进入容错");
                return product;
            }
        };

    }
}
*/
