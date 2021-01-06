package cn.congee.api.service;

import cn.congee.api.domain.entity.PatInfo;
import cn.congee.api.repository.PatInfoRepository;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * @Date: 2021/1/5
 * @Time: 18:47
 * @author: wgb
 **/
@Slf4j
@Service
public class PatInfoService {

    @Autowired
    private PatInfoRepository patInfoRepository;

    /**
     * 添加用户
     * @param patInfo
     * @return
     */
    public boolean savePatInfo(PatInfo patInfo) {
        log.info("开始调用保存用户信息入参为patInfo=[{}]", JSON.toJSONString(patInfo));
        boolean flag = false;
        if(patInfo != null){
            PatInfo info = patInfoRepository.save(patInfo);
            if(info != null){
                flag = Boolean.TRUE;
            }
        }
        log.info("开始调用保存用户信息出参为flag=[{}]", flag);
        return flag;
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    public boolean deletePatInfoById(Integer id) {
        log.info("开始调用根据id删除用户信息入参为id=[{}]", id);
        boolean flag = false;
        if(null != id){
            /**
             * 将要删除的数据的id封装进模型中,然后调用删除方法即可
             * 注:删除是以键为准进行删除的,即:不论模型中的其他属性是否与表中数据对应的
             * 上,只要主键对应的上,那么就会删除表中对应行的数据
             */
            PatInfo build = PatInfo.builder().id(id).build();
            patInfoRepository.delete(build);
            //patInfoRepository.deleteById(id);
            flag = Boolean.TRUE;
        }
        log.info("开始调用根据id删除用户信息出参为flag=[{}]", flag);
        return flag;
    }

    /**
     * 查询所有
     * @return
     */
    public List<PatInfo> findAll() {
        log.info("开始调用查询所有用户信息");
        List<PatInfo> patInfoList = patInfoRepository.findAll();
        log.info("开始调用查询所有用户信息出参为patInfoList=[{}]", JSON.toJSONString(patInfoList));
        return CollectionUtils.isEmpty(patInfoList) ? null : patInfoList;
    }

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public PatInfo findById(Integer id) {
        log.info("开始调用根据id查询用户信息入参为id=[{}]", id);
        PatInfo patInfo = null;
        if(null != id ){
            Optional<PatInfo> optional = patInfoRepository.findById(id);
            if(optional != null){
                patInfo = optional.get();
            }
        }
        log.info("开始调用根据id查询用户信息出参为patInfo=[{}]", JSON.toJSONString(patInfo));
        return patInfo;
    }

    /**
     * 模糊查询
     * @param keyword
     * @return
     */
    /*public List<PatInfo> findLikeConcat(String keyword) {
        log.info("开始调用根据keyword模糊查询用户信息入参为keyword=[{}]", keyword);
        List<PatInfo> list = new ArrayList<>();
        if(null != keyword){
            List<PatInfo> patInfoList = patInfoRepository.findLikeConcat(keyword);
            Iterator<PatInfo> iterator = patInfoList.iterator();
            while (iterator.hasNext()){
                list.add(iterator.next());
            }
        }
        log.info("开始调用根据keyword模糊查询用户信息出参为list=[{}]", JSON.toJSONString(list));
        return CollectionUtils.isEmpty(list) ? null : list;
    }*/

    /**
     * 修改用户
     * @param patInfo
     * @return
     */
    public boolean updatePatInfo(PatInfo patInfo) {
        log.info("开始调用更新用户信息入参为patInfo=[{}]", JSON.toJSONString(patInfo));
        boolean flag = false;
        PatInfo info = new PatInfo();
        if(patInfo != null && patInfo.getId() != null){
            //如果存在,则进行修改
            boolean exist = patInfoRepository.existsById(patInfo.getId());
            if(exist){
                //通过覆盖式新增的方式,实现改
                PatInfo build = PatInfo.builder().id(patInfo.getId())
                        .name(patInfo.getName())
                        .pass(patInfo.getPass())
                        .age(patInfo.getAge())
                        .gender(patInfo.getGender())
                        .address(patInfo.getAddress())
                        .phone(patInfo.getPhone())
                        .idNo(patInfo.getIdNo())
                        .birth(patInfo.getBirth())
                        .createTime(patInfo.getCreateTime())
                        .updateTime(patInfo.getUpdateTime())
                        .extendParam(patInfo.getExtendParam())
                        .build();
                PatInfo save = patInfoRepository.save(build);
                if(save != null){
                    flag = Boolean.TRUE;
                }
            }
        }
        log.info("开始调用更新用户信息出参为flag=[{}]", flag);
        return flag;
    }

    /**
     * 分页查询
     *
     * @param page 当前页
     * @param size 每页显示多少条
     * @return
     * @throws Exception
     */
    public Page<PatInfo> pagingQuery(Integer page, Integer size) throws Exception{
        Sort.Order order = new Sort.Order(Sort.Direction.DESC, "createTime").nullsLast();
        Pageable pageable = PageRequest.of(page, size, Sort.by(order));
        Page<PatInfo> patInfos = patInfoRepository.findAll(pageable);
        System.out.println("数据的总条数：" + patInfos.getTotalElements());
        System.out.println("总页数：" + patInfos.getTotalPages());
        System.out.println("返回data: " + patInfos.getContent());
        return patInfos != null ? patInfos : null;
    }

}
