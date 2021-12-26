package com.jxl.dcain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * order
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:03
 */
@Entity(name="shop_order")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long oid;

    private Integer uid;
    private String username;

    private Integer pid;
    private String pname;
    private Double pprice;

    private Integer number;
}
