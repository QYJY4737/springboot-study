package cn.congee.api.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 标准字典表
 *
 * @Date: 2021/1/7
 * @Time: 15:55
 * @author: wgb
 **/
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dic_stan")
public class DicStanEntity extends BaseEntity {

    /**
     * 主键ID
     */
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 字典类别编码
     */
    @NotNull
    @Column(name = "dic_code")
    private String dicCode;

    /**
     * 字典项编码
     */
    @NotNull
    private String code;

    /**
     * 字典项值
     */
    private String name;

    /**
     * 顺序号
     */
    private Integer sort;

    /**
     * 状态
     */
    private String state;

    /**
     * 搜索关键字
     */
    private String keyword;

    /**
     * 只读标志 0：只读 2：读写
     */
    @NotNull
    @Column(name = "read_only")
    private Integer readOnly;

    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 附加信息，可能有多个，以json存储
     */
    @Column(name = "add_info")
    private String addInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Integer readOnly) {
        this.readOnly = readOnly;
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

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    @Override
    public String toString() {
        return "DicStanEntity{" +
                "id=" + id +
                ", dicCode='" + dicCode + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", sort=" + sort +
                ", state='" + state + '\'' +
                ", keyword='" + keyword + '\'' +
                ", readOnly=" + readOnly +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", addInfo='" + addInfo + '\'' +
                '}';
    }

}
