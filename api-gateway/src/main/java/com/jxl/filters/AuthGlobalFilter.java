package com.jxl.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.swing.*;

/**
 * globalfilter
 * 全局过滤器，统一鉴权
 * @author jiangxinlin
 * @create 2021-12-24-15:16
 */
//@Component
public class AuthGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
       //统一鉴权
        String  token= exchange.getRequest().getQueryParams().getFirst("token");
        if(!token.equals("admin")){
            //认证失败了
            System.out.println("认证失败");
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();

        }
        return chain.filter(exchange);
    }
//标识过滤器优先级 ，越小越高
    @Override
    public int getOrder() {
        return 0;
    }
}
