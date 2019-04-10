package com.jinx.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinx
 * @date 2019/4/9 15:18
 * Desc:
 */
@RestController
public class HelloController {


    @RequestMapping("hello")
    public String index() {
        return "Hello World";
    }

}
