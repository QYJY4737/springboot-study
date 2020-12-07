package cn.congee.api.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: yang
 * @Date: 2020-12-07 10:47
 */
@Data
@Table(name = "tb_user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

}
