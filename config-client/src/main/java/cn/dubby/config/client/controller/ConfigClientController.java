package cn.dubby.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这边的@RefreshScope注解不能少，否则即使调用/refresh，配置也不会刷新
 * Created by teeyoung on 17/9/21.
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${name}")
    private String name;

    @GetMapping("/name")
    public String name() {
        return this.name;
    }
}
