package cn.congee.api.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: yang
 * @Date: 2020-12-08 3:48
 */
@Data
@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_pwd")
    private String userPwd;

}
