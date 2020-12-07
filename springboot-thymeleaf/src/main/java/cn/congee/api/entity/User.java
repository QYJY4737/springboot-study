package cn.congee.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yang
 * @Date: 2020-12-07 10:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;
    private Integer age;
    private String role;
    private User friend;// 对象类型属性

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
