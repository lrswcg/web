package com.web.dao;

import com.web.entity.CostEntity;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/26.
 */
public interface CostDao {
    boolean add(CostEntity costEntity);
    boolean update(CostEntity costEntity);
    boolean delete(CostEntity costEntity);
    List<CostEntity> getAll();
    CostEntity getbyId(int repairId);
}
