package com.web.dao;

import com.web.entity.ClientEntity;
import com.web.entity.DeviceEntity;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/28.
 */
public interface DeviceDao {
    boolean add(DeviceEntity DeviceEntity);
    boolean update(DeviceEntity DeviceEntity);
    boolean delete(int repairId);
    List<DeviceEntity> getAll();
    DeviceEntity getbyId(int repairId);
    ClientEntity getClientbyId(int repairId);
}
