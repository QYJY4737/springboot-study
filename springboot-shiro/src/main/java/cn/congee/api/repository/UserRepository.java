package cn.congee.api.repository;

import cn.congee.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yang
 * @Date: 2020-12-08 3:52
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

}
