package cn.congee.controller;

import cn.congee.entity.EsEvent;
import cn.congee.util.ElasticsearchUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yang
 * @Date: 2020-12-16 9:48
 */
@Slf4j
@RestController
@RequestMapping("/es")
public class EsController {

    @Autowired
    private ElasticsearchUtil elasticsearchUtil;

    @GetMapping("/createIndex")
    public String createIndex(){
        try {
            elasticsearchUtil.createIndexIfNotExist(EsEvent.class);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }

}
