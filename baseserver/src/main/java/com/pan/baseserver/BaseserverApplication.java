package com.pan.baseserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 基础服务
 * 用户、角色、部门等基础信息
 *
 * @author tangpan
 * @date 2020/10/21 18:44
 */
@SpringBootApplication
@EnableEurekaClient
public class BaseserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseserverApplication.class, args);
    }

}
