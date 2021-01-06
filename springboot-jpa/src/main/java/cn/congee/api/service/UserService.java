package cn.congee.api.service;

import cn.congee.api.domain.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;
/**
 * @Author: yang
 * @Date: 2020-12-08 2:26
 */
public interface UserService {

    void save(User user);

    void update(User user);

    void delete(Integer id);

    User findById(Integer id);

    List<User> findAll();

    Page<User> listByPage(int pageCode, int pageSize);

    User findByUserName(String userName);

    User findByName(String userName);

}
