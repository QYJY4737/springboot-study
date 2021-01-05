package cn.congee.api.controller;

import cn.congee.api.entity.PatInfo;
import cn.congee.api.service.PatInfoService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.CollectionUtils;
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
    public String savePatInfo(@RequestBody PatInfo patInfo){
        boolean flag = patInfoService.savePatInfo(patInfo);
        log.info("添加用户信息结果为: " + flag);
        return Boolean.TRUE.equals(flag) ? "添加成功" : "添加失败";
    }

    @DeleteMapping("/delPat/{id}")
    public String deletePatInfoById(@PathVariable(value = "id") Integer id){
        boolean flag = patInfoService.deletePatInfoById(id);
        log.info("删除用户信息结果为: " + flag);
        return Boolean.TRUE.equals(flag) ? "删除成功" : "删除失败";
    }

    @GetMapping("/selAll")
    public String findAll(){
        List<PatInfo> patInfoList = patInfoService.findAll();
        log.info("查询所有用户信息结果为: " + JSON.toJSONString(patInfoList));
        List<String> names = patInfoList.stream().map(PatInfo::getName).collect(Collectors.toList());
        names.stream().forEach(e -> System.out.println(e));
        return !CollectionUtils.isEmpty(patInfoList) ? names.toString() : "查询所有失败";
    }

    @GetMapping("/selOne")
    public String findById(@RequestParam(value = "id") Integer id){
        PatInfo patInfo = patInfoService.findById(id);
        log.info("查询某个用户信息结果为: " + JSON.toJSONString(patInfo));
        return null != patInfo ? patInfo.toString() : "查询某个失败";
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
    public String updatePatInfo(@RequestBody PatInfo patInfo){
        boolean flag = patInfoService.updatePatInfo(patInfo);
        log.info("更新用户信息结果为: " + flag);
        return Boolean.TRUE.equals(flag) ? "更新成功" : "更新失败";
    }

    @GetMapping("/paging/{page}/{size}")
    public String pagingQuery(@PathVariable(value = "page") Integer page, @PathVariable(value = "size") Integer size){
        Page<PatInfo> patInfos = null;
        try{
            patInfos = patInfoService.pagingQuery(page, size);
            log.info("分页查询用户信息结果为: " + JSON.toJSONString(patInfos.getContent()));
        }catch (Exception e){
            log.error("分页查询报错: " + e.getMessage());
            e.printStackTrace();
        }
        return null != patInfos ? JSON.toJSONString(patInfos.getContent()) : "分页查询失败";
    }

}

