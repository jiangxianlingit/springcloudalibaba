package jxl.service;

import com.jxl.dcain.Product;

/**
 * user
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:33
 */

public interface ProductService  {
    Product findByid(Integer pid);

    //    扣减库存
    void reduceInventory(Integer pid, Integer number);
}
