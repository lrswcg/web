package com.web.service.serviceimpl;

import com.web.dao.CostDao;
import com.web.entity.CostEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/26.
 */
@Service
@Transactional
public class CostServiceImpl implements CostDao{
    @Autowired
    private CostDao costDao;

    public void setCostDao(CostDao costDao) {
        this.costDao = costDao;
    }

    @Override
    public boolean add(CostEntity CostEntity) {
        costDao.add(CostEntity);
        return true;
    }

    @Override
    public boolean update(CostEntity CostEntity) {
        costDao.update(CostEntity);
        return true;
    }

    @Override
    public boolean delete(CostEntity CostEntity) {
        costDao.delete(CostEntity);
        return true;
    }

    @Override
    public List<CostEntity> getAll() {
        return costDao.getAll();
    }

    @Override
    public CostEntity getbyId(int repairId) {
        return costDao.getbyId(repairId);
    }
}
