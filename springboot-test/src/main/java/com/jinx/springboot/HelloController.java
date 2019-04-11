package com.jinx.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jinx
 * @date 2019/4/9 15:18
 * Desc:
 */
@RestController
@Slf4j
public class HelloController {

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String index() {
        ServiceInstance instance = (ServiceInstance) discoveryClient.getInstances("HELLO-SERVICE").get(0);
        log.info("/hello,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "Hello World";
    }

}
