package com.bnaqica.schoolgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SchoolGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolGatewayApplication.class, args);
    }

}
