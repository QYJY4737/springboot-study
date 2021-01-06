package cn.congee.api.domain.entity;

import lombok.Data;

import javax.persistence.*;
/**
 * @Author: yang
 * @Date: 2020-12-08 2:24
 */
@Data
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String userPassword;

}
