package jxl.service;

import com.jxl.dcain.Order;
import jxl.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * imp
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:35
 */
@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    private OrderDao orderDao;
    @Override
    public void createOrder(Order order) {
        orderDao.save(order);
    }
}
