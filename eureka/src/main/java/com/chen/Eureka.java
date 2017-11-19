package com.chen;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by chenyong on 2017-11-18.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaServer
public class Eureka {
    public static void main(String[] args) {
      new SpringApplicationBuilder(Eureka.class).web(true)
              .run(args);
    }
}
