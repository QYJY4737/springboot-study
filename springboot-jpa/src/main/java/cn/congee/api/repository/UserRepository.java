package cn.congee.api.repository;

import cn.congee.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
/**
 * @Author: yang
 * @Date: 2020-12-08 2:25
 */
public interface UserRepository extends JpaRepository<User, Integer>{

    User findByUserName(String username);

    // 方式一：hql语句
    @Query(value = "select u from User u where u.userName = ?1")
    // 方式二：原生的sql
    // @Query(value = "select * from tb_user where user_name = ?1", nativeQuery = true)
    User finByName(String userName);

}
