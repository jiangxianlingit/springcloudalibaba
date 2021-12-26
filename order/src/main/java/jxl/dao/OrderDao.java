package jxl.dao;

import com.jxl.dcain.Order;
import com.jxl.dcain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * user
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:36
 */
@Component
public interface OrderDao extends JpaRepository<Order,Integer> {
}
