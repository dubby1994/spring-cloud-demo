package cn.dubby.service.user.demo.dao;

import cn.dubby.service.user.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by teeyoung on 17/9/21.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
