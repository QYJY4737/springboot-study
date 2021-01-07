package cn.congee.api.controller;

import cn.congee.api.common.resp.ResponseDTO;
import cn.congee.api.domain.entity.DicStanEntity;
import cn.congee.api.service.DicStanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Date: 2021/1/7
 * @Time: 16:07
 * @author: wgb
 **/
@Api(value = "标准字典相关接口")
@RestController
@RequestMapping(value = "/dic")
public class DicStanController {

    @Autowired
    private DicStanService dicStanService;

    @ApiOperation(value = "根据dicCode查询字典值", notes = "根据dicCode查询字典值")
    @GetMapping(value = "/getAll")
    public ResponseDTO<List<DicStanEntity>> getAllDicStanList(@RequestParam(value = "dicCode") String dicCode){
        return dicStanService.getAllDicStanList(dicCode);
    }

}
