package com.web.service.serviceimpl;

import com.web.dao.DeviceDao;
import com.web.entity.ClientEntity;
import com.web.entity.DeviceEntity;
import com.web.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/28.
 */
@Service
@Transactional
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceDao deviceDao;
    @Override
    public boolean add(DeviceEntity deviceEntity) {
        return deviceDao.add(deviceEntity);
    }

    @Override
    public boolean update(DeviceEntity deviceEntity) {
        return deviceDao.update(deviceEntity);
    }

    @Override
    public boolean delete(int repairId) {
        return deviceDao.delete(repairId);
    }

    @Override
    public List<DeviceEntity> getAll() {
        return deviceDao.getAll();
    }

    @Override
    public DeviceEntity getbyId(int repairId) {
        return deviceDao.getbyId(repairId);
    }

    @Override
    public ClientEntity getClientbyId(int repairId) {
        return deviceDao.getClientbyId(repairId);
    }
}
