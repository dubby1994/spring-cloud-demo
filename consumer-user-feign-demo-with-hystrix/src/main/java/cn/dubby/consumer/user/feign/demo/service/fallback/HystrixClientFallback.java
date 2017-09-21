package cn.dubby.consumer.user.feign.demo.service.fallback;

import cn.dubby.consumer.user.feign.demo.entity.User;
import cn.dubby.consumer.user.feign.demo.service.UserFeignHystrixClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by teeyoung on 17/9/21.
 */
@Component
public class HystrixClientFallback implements UserFeignHystrixClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

    /**
     * hystrix fallback方法
     * @param id id
     * @return 默认的用户
     */
    @Override
    public User findByIdFeign(Long id) {
        HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
        User user = new User();
        user.setId(-1L);
        user.setUsername("default username");
        user.setAge(0);
        return user;
    }
}
