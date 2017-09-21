package cn.dubby.consumer.user.ribbon.hystrix.demo.controller;

import cn.dubby.consumer.user.ribbon.hystrix.demo.entity.User;
import cn.dubby.consumer.user.ribbon.hystrix.demo.service.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teeyoung on 17/9/21.
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonHystrixService ribbonHystrixService;

    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return this.ribbonHystrixService.findById(id);
    }
}
