package cn.congee.api.mapper;

import cn.congee.api.entity.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:52
 */
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
}
