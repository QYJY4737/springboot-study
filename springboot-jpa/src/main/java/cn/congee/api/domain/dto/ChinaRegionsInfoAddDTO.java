package cn.congee.api.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 添加dto
 *
 * @Date: 2021/1/6
 * @Time: 16:54
 * @author: wgb
 **/
@Data
public class ChinaRegionsInfoAddDTO {

    @ApiModelProperty("行政区域编码")
    private String code;

    @ApiModelProperty("行政区域名称")
    private String name;

    @ApiModelProperty("行政区域类型,1:省份,2:城市,3:区或者县城")
    private Integer type;

    @ApiModelProperty("上一级行政区域编码")
    private String parentCode;

}
