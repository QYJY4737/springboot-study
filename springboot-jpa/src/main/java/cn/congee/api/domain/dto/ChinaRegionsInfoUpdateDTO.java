package cn.congee.api.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 更新dto
 *
 * @Date: 2021/1/6
 * @Time: 16:54
 * @author: wgb
 **/
@Data
public class ChinaRegionsInfoUpdateDTO extends ChinaRegionsInfoAddDTO {

    @ApiModelProperty("主键ID")
    private Integer id;

}
