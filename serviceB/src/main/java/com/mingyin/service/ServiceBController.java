package com.mingyin.service;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class ServiceBController {

    @Autowired
    private ServiceAClient serviceAClient;

    @RequestMapping(value = "/sayHello",
            method = RequestMethod.GET)
    public String greeting(@RequestParam("name") String name) {
        return serviceAClient.sayHello(name);
    }

    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    public String findById(@RequestParam("id") String id){
        return serviceAClient.findById(id);
    }
}
