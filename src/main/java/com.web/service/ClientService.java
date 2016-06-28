package com.web.service;

import com.web.entity.ClientEntity;
import com.web.entity.DeviceEntity;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/24.
 */
public interface ClientService {
    boolean add(ClientEntity clientEntity);
    boolean update(ClientEntity clientEntity);
    boolean delete(int clientId);
    List<ClientEntity> getAll();
    ClientEntity getbyId(int clientId);
    List<DeviceEntity> getDevicebyId(int clientId);
}
