package jxl.dao;

import com.jxl.dcain.Product;
import com.jxl.dcain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * user
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:36
 */
@Component
public interface ProductDao extends JpaRepository<Product,Integer> {
}
