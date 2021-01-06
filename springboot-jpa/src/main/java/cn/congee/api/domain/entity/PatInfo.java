package cn.congee.api.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表
 *
 * @Date: 2021/1/5
 * @Time: 18:43
 * @author: wgb
 **/
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pat_info")
public class PatInfo implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 用户ID
     */
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户密码
     */
    private String pass;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String gender;

    /**
     * 地址
     */
    private String address;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 身份证
     */
    @NotNull
    @Column(name = "idno")
    private String idNo;

    /**
     * 生日
     */
    private String birth;

    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "createtime")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "updatetime")
    private Date updateTime;

    /**
     * 扩展参数
     */
    @Column(name = "extendparam")
    private String extendParam;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(String extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public String toString() {
        return "PatInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", idNo='" + idNo + '\'' +
                ", birth='" + birth + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", extendParam='" + extendParam + '\'' +
                '}';
    }
}

