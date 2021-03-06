package com.zccoder.boot1.ch12.cloud.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @title 启动类
 * @describe 断路器监控
 * @author zc
 * @version 1.0 2017-10-14
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
public class CloudMonitorStart {

    public static void main(String[] args) {
        SpringApplication.run(CloudMonitorStart.class, args);
    }
}
