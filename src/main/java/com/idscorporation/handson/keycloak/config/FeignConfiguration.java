package com.idscorporation.handson.keycloak.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.idscorporation.handson.keycloak")
public class FeignConfiguration {

}
