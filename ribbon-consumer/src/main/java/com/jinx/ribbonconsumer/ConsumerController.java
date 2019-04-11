package com.jinx.ribbonconsumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author jinx
 * @date 2019/4/11 14:43
 * Desc:
 */
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate template;

    @RequestMapping(value = "ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return template.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
    }

}
