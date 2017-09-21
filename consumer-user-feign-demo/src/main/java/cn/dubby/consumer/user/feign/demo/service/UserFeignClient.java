package cn.dubby.consumer.user.feign.demo.service;

import cn.dubby.consumer.user.feign.demo.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by teeyoung on 17/9/21.
 */
@FeignClient(name = "service-user-demo")
public interface UserFeignClient {
    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);
}
