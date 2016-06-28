package com.web.service.serviceimpl;

import com.web.dao.ClientDao;
import com.web.entity.ClientEntity;
import com.web.entity.DeviceEntity;
import com.web.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/24.
 */
@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public boolean add(ClientEntity clientEntity) {
        return clientDao.add(clientEntity);
    }

    @Override
    public boolean update(ClientEntity clientEntity) {
        return clientDao.update(clientEntity);
    }

    @Override
    public boolean delete(int clientId) {
        return clientDao.delete(clientId);
    }

    @Override
    public List<ClientEntity> getAll() {
        return clientDao.getAll();
    }

    @Override
    public ClientEntity getbyId(int clientId) {
        return clientDao.getbyId(clientId);
    }



    @Override
    public List<DeviceEntity> getDevicebyId(int clientId) {
        return clientDao.getDevicebyId(clientId);
    }
}
