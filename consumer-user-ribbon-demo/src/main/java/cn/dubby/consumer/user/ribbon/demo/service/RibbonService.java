package cn.dubby.consumer.user.ribbon.demo.service;

import cn.dubby.consumer.user.ribbon.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by teeyoung on 17/9/21.
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public User findById(Long id) {
        // http://服务提供者的serviceId/url
        return this.restTemplate.getForObject("http://service-user-demo/" + id, User.class);
    }

}
