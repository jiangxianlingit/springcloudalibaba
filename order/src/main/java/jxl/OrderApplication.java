package jxl;

import com.alibaba.druid.proxy.jdbc.DataSourceProxyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 *
 * @author jiangxinlin
 * @create 2021-12-22-18:14
 */
@EntityScan(basePackages = "com.jxl.dcain")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableDiscoveryClient
@EnableFeignClients  //开启feign的客户端
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }

/*    @Bean
    @LoadBalanced
    public RestTemplate template(){
        return new RestTemplate();
    }*/
}
