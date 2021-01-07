package cn.congee.api.controller;

import cn.congee.api.common.resp.ResponseDTO;
import cn.congee.api.domain.entity.PatInfoEntity;
import cn.congee.api.service.PatInfoService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


/**
 * 用户信息相关接口
 *
 * @Date: 2021/1/5
 * @Time: 18:49
 * @author: wgb
 **/
@Slf4j
@RestController
@RequestMapping("/todo/pat")
public class PatInfoController {

    @Autowired
    private PatInfoService patInfoService;

    @PostMapping("/addPat")
    public ResponseDTO savePatInfo(@RequestBody PatInfoEntity patInfoEntity){
        boolean flag = patInfoService.savePatInfo(patInfoEntity);
        log.info("添加用户信息结果为: " + flag);
        return new ResponseDTO(flag);
    }

    @DeleteMapping("/delPat/{id}")
    public ResponseDTO deletePatInfoById(@PathVariable(value = "id") Integer id){
        boolean flag = patInfoService.deletePatInfoById(id);
        log.info("删除用户信息结果为: " + flag);
        return new ResponseDTO(flag);
    }

    @GetMapping("/selAll")
    public ResponseDTO<List<PatInfoEntity>> findAll(){
        List<PatInfoEntity> patInfoEntityList = patInfoService.findAll();
        log.info("查询所有用户信息结果为: " + JSON.toJSONString(patInfoEntityList));
        List<String> names = patInfoEntityList.stream().map(PatInfoEntity::getName).collect(Collectors.toList());
        names.stream().forEach(e -> System.out.println(e));
        List<String> authStateDcList = patInfoEntityList.stream().map(PatInfoEntity::getAuthStateDc).collect(Collectors.toList());
        authStateDcList.stream().forEach(o -> System.out.println(o));
        return new ResponseDTO<>(patInfoEntityList);
    }

    @GetMapping("/selOne")
    public ResponseDTO<PatInfoEntity> findById(@RequestParam(value = "id") Integer id){
        PatInfoEntity patInfoEntity = patInfoService.findById(id);
        log.info("查询某个用户信息结果为: " + JSON.toJSONString(patInfoEntity));
        return new ResponseDTO<>(patInfoEntity);
    }

    /*@GetMapping("/selKey")
    public String findLikeConcat(@RequestParam(value = "keyword") String keyword){
        List<PatInfo> patInfoList = patInfoService.findLikeConcat(keyword);
        log.info("模糊查询用户信息结果为: " + JSON.toJSONString(patInfoList));
        List<String> names = patInfoList.stream().map(PatInfo::getName).collect(Collectors.toList());
        names.stream().forEach(e -> System.out.println(e));
        return !CollectionUtils.isEmpty(patInfoList) ? names.toString() : "模糊查询失败";
    }*/

    @PostMapping("/updPat")
    public ResponseDTO updatePatInfo(@RequestBody PatInfoEntity patInfoEntity){
        boolean flag = patInfoService.updatePatInfo(patInfoEntity);
        log.info("更新用户信息结果为: " + flag);
        return new ResponseDTO(flag);
    }

    @GetMapping("/paging/{page}/{size}")
    public ResponseDTO<Page<PatInfoEntity>> pagingQuery(@PathVariable(value = "page") Integer page, @PathVariable(value = "size") Integer size){
        Page<PatInfoEntity> patInfos = null;
        try{
            patInfos = patInfoService.pagingQuery(page, size);
            log.info("分页查询用户信息结果为: " + JSON.toJSONString(patInfos.getContent()));
        }catch (Exception e){
            log.error("分页查询报错: " + e.getMessage());
            e.printStackTrace();
        }
        return new ResponseDTO<>(patInfos);
    }

}

