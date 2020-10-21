package com.pan.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * web服务
 * 开启eureka 客户端
 * 开启feign
 *
 * @author tangpan
 * @date 2020/10/20 17:31
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
