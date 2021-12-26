package com.jxl.predicates;

import lombok.Data;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.BeforeRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * 断言
 *
 * @author jiangxinlin
 * @create 2021-12-24-11:53
 */
@Component
public class AgeRoutePredicateFactory extends AbstractRoutePredicateFactory<AgeRoutePredicateFactory.Config> {


    public AgeRoutePredicateFactory() {
        super(AgeRoutePredicateFactory.Config.class);
    }
    //读取文件，赋值数据，顺序对应
    public List<String> shortcutFieldOrder() {
        return Arrays.asList("mixAge","maxAge");
    }
    //断言逻辑
    public Predicate<ServerWebExchange> apply(AgeRoutePredicateFactory.Config config) {
        return new Predicate<ServerWebExchange>() {
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                //接受前台的参数
               String agestr= serverWebExchange.getRequest().getQueryParams().getFirst("age");
                if(!StringUtils.isEmpty(agestr)){
                    int age = Integer.parseInt(agestr);
                    if(age > config.getMinAge() && age < config.getMaxAge()){
                        return true;
                    }
                    return false;
                }

                return false;
            }
        };
    }
    @Data
    public static class Config {
        private int minAge;
        private int maxAge;
        public Config() {
        }

        public int getMinAge() {
            return minAge;
        }

        public void setMinAge(int minAge) {
            this.minAge = minAge;
        }

        public int getMaxAge() {
            return maxAge;
        }

        public void setMaxAge(int maxAge) {
            this.maxAge = maxAge;
        }
    }
}
