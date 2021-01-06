package cn.congee.api.controller;

import cn.congee.api.common.resp.ResponseDTO;
import cn.congee.api.domain.dto.ChinaRegionsInfoAddDTO;
import cn.congee.api.domain.dto.ChinaRegionsInfoUpdateDTO;
import cn.congee.api.domain.vo.ChinaRegionsInfoVO;
import cn.congee.api.service.ChinaRegionsInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Date: 2021/1/6
 * @Time: 17:07
 * @author: wgb
 **/
@Api(value = "行政编码相关接口")
@RestController
@RequestMapping(value = "/china")
public class ChinaRegionsInfoController {

    @Autowired
    private ChinaRegionsInfoService chinaRegionsInfoService;

    @ApiOperation(value = "添加行政编码", notes = "将爬取记录写入库中")
    @PostMapping("/save")
    public ResponseDTO saveChinaRegionsInfo(@RequestBody ChinaRegionsInfoAddDTO chinaRegionsInfoAddDTO){
        return chinaRegionsInfoService.saveChinaRegionsInfo(chinaRegionsInfoAddDTO);
    }

    @ApiOperation(value = "删除行政编码", notes = "根据id删除行政编码")
    @DeleteMapping(value = "/delete/{id}")
    public ResponseDTO deleteChinaRegionsInfo(@PathVariable(value = "id") Integer id){
        return chinaRegionsInfoService.deleteChinaRegionsInfo(id);
    }

    @ApiOperation(value = "获取全国省市区行政编码列表", notes = "获取库中爬取的行政编码列表")
    @GetMapping(value = "/getAll")
    public ResponseDTO<List<ChinaRegionsInfoVO>> getAllChinaRegionsInfoList(){
        return chinaRegionsInfoService.getAllChinaRegionsInfoList();
    }

    @ApiOperation(value = "查询行政编码", notes = "根据id查询行政编码")
    @GetMapping(value = "/findById/{id}")
    public ResponseDTO<ChinaRegionsInfoVO> findChinaRegionsInfoById(@PathVariable(value = "id") Integer id){
        return chinaRegionsInfoService.findChinaRegionsInfoById(id);
    }

    @ApiOperation(value = "更新行政编码", notes = "将爬取记录更新入库")
    @PutMapping(value = "/update")
    public ResponseDTO updateChinaRegionsInfo(@RequestBody ChinaRegionsInfoUpdateDTO chinaRegionsInfoUpdateDTO){
        return chinaRegionsInfoService.updateChinaRegionsInfo(chinaRegionsInfoUpdateDTO);
    }

}
