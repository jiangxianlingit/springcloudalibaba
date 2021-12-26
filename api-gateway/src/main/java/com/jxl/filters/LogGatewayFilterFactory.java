package com.jxl.filters;

import lombok.Data;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

/**
 * filter
 *
 * @author jiangxinlin
 * @create 2021-12-24-15:02
 */
@Component
public class LogGatewayFilterFactory extends AbstractGatewayFilterFactory<LogGatewayFilterFactory.Config> {
   //构造
    public LogGatewayFilterFactory(){
       super(LogGatewayFilterFactory.Config.class);
   }
   //读取文件参数，赋值配置中
    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("consoleLog","cacheLog");
    }
    //过滤器逻辑
    @Override
    public GatewayFilter apply(Config config) {
        return new GatewayFilter() {
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                if(config.isCacheLog()){
                    System.out.println("开启缓存日志");
                }
                if(config.isConsoleLog()){
                    System.out.println("开启consoleLog日志");
                }
                return chain.filter(exchange);
            }
        };
    }
    //配置类，接收配置参数
    @Data
    public static class Config{
        private boolean consoleLog;
        private boolean cacheLog;
        public Config(){

        }
    }
}
