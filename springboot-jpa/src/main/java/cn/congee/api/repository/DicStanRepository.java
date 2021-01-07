package cn.congee.api.repository;

import cn.congee.api.domain.entity.DicStanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Date: 2021/1/7
 * @Time: 16:04
 * @author: wgb
 **/
@Transactional
@Repository
public interface DicStanRepository extends JpaRepository<DicStanEntity, Integer> {

    /**
     * 根据dicCode查询字典值
     *
     * @param dicCode
     * @return
     */
    List<DicStanEntity> findByDicCode(String dicCode);

}
