package com.jxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主类
 *
 * @author jiangxinlin
 * @create 2021-12-24-9:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGateWayApplication.class);
    }
}
