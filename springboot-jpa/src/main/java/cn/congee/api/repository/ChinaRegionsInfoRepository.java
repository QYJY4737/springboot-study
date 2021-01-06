package cn.congee.api.repository;

import cn.congee.api.domain.entity.ChinaRegionsInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * @Date: 2021/1/6
 * @Time: 16:56
 * @author: wgb
 **/
@Transactional
@Repository
public interface ChinaRegionsInfoRepository extends JpaRepository<ChinaRegionsInfoEntity, Integer> {
}
