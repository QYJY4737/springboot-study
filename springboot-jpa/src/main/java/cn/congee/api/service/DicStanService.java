package cn.congee.api.service;

import cn.congee.api.common.resp.ResponseDTO;
import cn.congee.api.domain.entity.DicStanEntity;
import cn.congee.api.repository.DicStanRepository;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Date: 2021/1/7
 * @Time: 16:06
 * @author: wgb
 **/
@Slf4j
@Service
public class DicStanService {

    @Autowired
    private DicStanRepository dicStanRepository;

    /**
     * 根据dicCode查询字典值
     *
     * @param dicCode
     * @return
     */
    public ResponseDTO<List<DicStanEntity>> getAllDicStanList(String dicCode){
        log.info("根据dicCode查询字典值入参为dicCode=[{}]", dicCode);
        List<DicStanEntity> dicStanEntityList = dicStanRepository.findByDicCode(dicCode);
        log.info("根据dicCode查询字典值出参为dicStanEntityList=[{}]", JSON.toJSONString(dicStanEntityList));
        if(!CollectionUtils.isEmpty(dicStanEntityList)){
            return new ResponseDTO<>(dicStanEntityList);
        }
        return new ResponseDTO<>();
    }

}
