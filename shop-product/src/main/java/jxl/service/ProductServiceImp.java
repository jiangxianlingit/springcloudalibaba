package jxl.service;

import com.jxl.dcain.Product;
import jxl.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * imp
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:35
 */
@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductDao productDao;
    @Override
    public Product findByid(Integer pid) {
        return productDao.findById(pid).get();
    }
    //扣减库存
    @Override
    public void reduceInventory(Integer pid, Integer number) {
        Product product=   productDao.findById(pid).get();
        product.setStock(product.getStock()-number);
        productDao.save(product);
    }
}
