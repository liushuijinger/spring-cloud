package com.liushuijing.springcloud.consumer;

import org.springframework.stereotype.Component;

/**
 * @Author : 刘水镜
 * @Description :
 * @Date Create in 2019/2/17 19:16
 */
@Component
public class BreakerClient implements ConsumerClient {
    @Override
    public String hello() {
        return "sorry";
    }
}
