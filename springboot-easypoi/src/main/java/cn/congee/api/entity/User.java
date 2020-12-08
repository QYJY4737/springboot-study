package cn.congee.api.entity;

import java.io.Serializable;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
/**
 * @Author: yang
 * @Date: 2020-12-08 7:46
 */
@Data
@Table(name = "tb_user")
public class User implements Serializable {

    @Excel(name = "id", width = 15)
    @NotNull(message = "该字段不能为空")
    private Integer id;

    @Excel(name = "姓名", orderNum = "0", width = 30)
    private String name;

    @Excel(name = "性别", replace = {"男_1", "女_2"}, orderNum = "1", width = 30)
    private String sex;

    @Excel(name = "生日", exportFormat = "yyyy-MM-dd HH:mm:ss", importFormat = "yyyy-MM-dd HH:mm:ss", orderNum = "2", width = 30)
    private Date birthday;

}
