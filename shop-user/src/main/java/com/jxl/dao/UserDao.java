package com.jxl.dao;

import com.jxl.dcain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * user
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:36
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
