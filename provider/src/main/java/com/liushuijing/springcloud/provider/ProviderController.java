package com.liushuijing.springcloud.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 刘水镜
 * @Description :
 * @Date Create in 2019/2/16 21:35
 */
@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Cloud !";
    }
}
