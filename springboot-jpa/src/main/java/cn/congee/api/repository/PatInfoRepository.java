package cn.congee.api.repository;

import cn.congee.api.domain.entity.PatInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Date: 2021/1/5
 * @Time: 18:47
 * @author: wgb
 **/
@Transactional
@Repository
public interface PatInfoRepository extends JpaRepository<PatInfo, Integer> {

    /**
     * 方法名称必须要遵循驼峰式命名规则，findBy（关键字）+属性名称（首字母大写）+查询条件（首字母大写）
     */
    List<PatInfo> findByIdNo(String idNo);

}
