package cn.congee.api.service;

import cn.congee.api.common.resp.ResponseDTO;
import cn.congee.api.common.util.BeanUtil;
import cn.congee.api.common.util.JsoupUtil;
import cn.congee.api.domain.dto.ChinaRegionsInfoAddDTO;
import cn.congee.api.domain.dto.ChinaRegionsInfoUpdateDTO;
import cn.congee.api.domain.entity.ChinaRegionsInfoEntity;
import cn.congee.api.domain.vo.ChinaRegionsInfoVO;
import cn.congee.api.repository.ChinaRegionsInfoRepository;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Date: 2021/1/6
 * @Time: 17:01
 * @author: wgb
 **/
@Slf4j
@Service
public class ChinaRegionsInfoService {

    @Autowired
    private ChinaRegionsInfoRepository chinaRegionsInfoRepository;

    /**
     * 添加行政编码
     *
     * @param chinaRegionsInfoAddDTO
     * @return
     */
    public ResponseDTO saveChinaRegionsInfo(ChinaRegionsInfoAddDTO chinaRegionsInfoAddDTO){
        log.info("添加行政编码入参为chinaRegionsInfoAddDTO=[{}]", JSON.toJSONString(chinaRegionsInfoAddDTO));
        if(chinaRegionsInfoAddDTO != null){
            ChinaRegionsInfoEntity chinaRegionsInfoEntity = new ChinaRegionsInfoEntity();
            BeanUtils.copyProperties(chinaRegionsInfoAddDTO, chinaRegionsInfoEntity);
            log.info("chinaRegionsInfoAddDTO转换为chinaRegionsInfoEntity结果为： ", JSON.toJSONString(chinaRegionsInfoEntity));
            ChinaRegionsInfoEntity save = chinaRegionsInfoRepository.save(chinaRegionsInfoEntity);
        }
        return ResponseDTO.succ();
    }

    /**
     * 根据id删除行政编码
     *
     * @param id
     * @return
     */
    public ResponseDTO deleteChinaRegionsInfo(Integer id){
        log.info("根据id删除行政编码入参为id=[{}]", id);
        if(id != null){
            ChinaRegionsInfoEntity build = ChinaRegionsInfoEntity.builder().id(id).build();
            chinaRegionsInfoRepository.delete(build);
        }
        return ResponseDTO.succ();
    }

    /**
     * 获取全国省市区行政编码列表
     *
     * @return
     */
    public ResponseDTO<List<ChinaRegionsInfoVO>> getAllChinaRegionsInfoList(){
        List<ChinaRegionsInfoVO> chinaRegionsInfoVOList = Lists.newArrayList();
        List<ChinaRegionsInfoEntity> chinaRegionsInfoEntityList = JsoupUtil.getAllChinaRegionsInfoEntity();
        log.info("爬取到的行政编码列表返回结果为chinaRegionsInfoEntityList=[{}]", JSON.toJSONString(chinaRegionsInfoEntityList));
        if(!CollectionUtils.isEmpty(chinaRegionsInfoEntityList)){
            chinaRegionsInfoEntityList.stream().forEach(item -> {
                ChinaRegionsInfoEntity build = ChinaRegionsInfoEntity.builder().code(item.getCode())
                        .name(item.getName())
                        .type(item.getType())
                        .parentCode(item.getParentCode())
                        .build();
                //ChinaRegionsInfoEntity save = chinaRegionsInfoRepository.save(build);
                ChinaRegionsInfoVO chinaRegionsInfoVO = new ChinaRegionsInfoVO();
                BeanUtils.copyProperties(build, chinaRegionsInfoVO);
                chinaRegionsInfoVO.setId(item.getId());
                chinaRegionsInfoVOList.add(chinaRegionsInfoVO);
            });
            log.info("获取全国省市区行政编码列表结果为: ", JSON.toJSONString(chinaRegionsInfoVOList));
            return new ResponseDTO<>(chinaRegionsInfoVOList);
        }
        return new ResponseDTO<>();
    }

    /**
     * 根据id查询行政编码
     *
     * @param id
     * @return
     */
    public ResponseDTO<ChinaRegionsInfoVO> findChinaRegionsInfoById(Integer id){
        log.info("根据id查询行政编码入参为id=[{}]", id);
        if (id != null){
            ChinaRegionsInfoEntity chinaRegionsInfoEntity = chinaRegionsInfoRepository.findById(id).get();
            ChinaRegionsInfoVO chinaRegionsInfoVO = new ChinaRegionsInfoVO();
            BeanUtils.copyProperties(chinaRegionsInfoEntity, chinaRegionsInfoVO);
            log.info("chinaRegionsInfoEntity转换为chinaRegionsInfoVO结果为： ", JSON.toJSONString(chinaRegionsInfoEntity));
            return new ResponseDTO<>(chinaRegionsInfoVO);
        }
        return new ResponseDTO<>();
    }

    /**
     * 更新行政编码
     *
     * @param chinaRegionsInfoUpdateDTO
     * @return
     */
    public ResponseDTO updateChinaRegionsInfo(ChinaRegionsInfoUpdateDTO chinaRegionsInfoUpdateDTO){
        log.info("更新行政编码入参为chinaRegionsInfoUpdateDTO=[{}]", JSON.toJSONString(chinaRegionsInfoUpdateDTO));
        if(chinaRegionsInfoUpdateDTO != null){
            ChinaRegionsInfoEntity entity = BeanUtil.copy(chinaRegionsInfoUpdateDTO, ChinaRegionsInfoEntity.class);
            log.info("chinaRegionsInfoUpdateDTO转换为chinaRegionsInfoEntity结果为： ", JSON.toJSONString(entity));
            chinaRegionsInfoRepository.saveAndFlush(entity);
        }
        return ResponseDTO.succ();
    }

}
