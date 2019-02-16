package com.liushuijing.springcloud.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 刘水镜
 * @Description :
 * @Date Create in 2019/2/16 21:40
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerClient consumerClient;

    @GetMapping("hello")
    public String hello() {
        return consumerClient.hello();
    }
}
