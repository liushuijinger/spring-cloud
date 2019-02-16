package com.liushuijing.springcloud.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author : 刘水镜
 * @Description :
 * @Date Create in 2019/2/16 21:37
 */
@FeignClient("provider")
public interface ConsumerClient {

    @GetMapping("/hello")
    String hello();
}
