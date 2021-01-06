package cn.congee.api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 全国省市区区域编码表
 *
 * @Date: 2021/1/6
 * @Time: 16:51
 * @author: wgb
 **/
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "china_regions_info")
public class ChinaRegionsInfoEntity implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 主键ID
     */
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 行政区域编码
     */
    @NotNull
    private String code;

    /**
     * 行政区域名称
     */
    @NotNull
    private String name;

    /**
     * 行政区域类型,1:省份,2:城市,3:区或者县城
     */
    @NotNull
    private Integer type;

    /**
     * 上一级行政区域编码
     */
    @NotNull
    @Column(name = "parentcode")
    private String parentCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    @Override
    public String toString() {
        return "ChinaRegionsInfoEntity{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", parentCode='" + parentCode + '\'' +
                '}';
    }

}
