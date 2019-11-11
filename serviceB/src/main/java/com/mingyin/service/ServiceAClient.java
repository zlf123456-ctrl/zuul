package com.mingyin.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "ServiceA")
public interface ServiceAClient {
    String sayHello(String name);

    String findById(String id);
}
