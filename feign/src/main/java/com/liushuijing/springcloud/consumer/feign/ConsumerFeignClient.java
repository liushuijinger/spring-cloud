package com.liushuijing.springcloud.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author : 刘水镜
 * @Description :
 * @Date Create in 2019/2/16 21:37
 */
@FeignClient(value = "provider", fallback = BreakerClientConsumer.class)
public interface ConsumerFeignClient {

    @GetMapping(value = "/hello")
    String hello();
}
