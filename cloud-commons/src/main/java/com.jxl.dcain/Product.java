package com.jxl.dcain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * product
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:01
 */
@Entity(name="shop_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;

    private String pname;
    private Double pprice;
    private Integer stock;
}
