package com.liushuijing.springcloud.consumer.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 刘水镜
 * @Description :
 * @Date Create in 2019/2/16 21:40
 */
@RestController
public class FeignController {

    @Autowired
    private ConsumerFeignClient consumerFeignClient;

    @GetMapping("hello")
    public String hello() {
        return consumerFeignClient.hello();
    }
}
