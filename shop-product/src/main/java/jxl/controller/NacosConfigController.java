package jxl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试动态刷新配置
 *
 * @author jiangxinlin
 * @create 2021-12-28-14:43
 */
/*@RestController
@RefreshScope*/
public class NacosConfigController {
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Value("${config.appName}")
    private String name;

    @RequestMapping("/configtest")
    public String testConfig(){
        return applicationContext.getEnvironment().getProperty("config.appName");
    }

    @RequestMapping("/configtest1")
    public String testConfig1(){
        return name;
    }
}
