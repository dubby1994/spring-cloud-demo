package cn.dubby.consumer.user.ribbon.hystrix.demo.service;

import cn.dubby.consumer.user.ribbon.hystrix.demo.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by teeyoung on 17/9/21.
 */
@Service
public class RibbonHystrixService {

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);

    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(Long id) {
        // http://服务提供者的serviceId/url
        return this.restTemplate.getForObject("http://service-user-demo/" + id, User.class);
    }

    public User fallback(Long id) {
        RibbonHystrixService.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }

}
