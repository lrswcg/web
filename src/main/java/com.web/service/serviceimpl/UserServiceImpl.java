package com.web.service.serviceimpl;

import com.web.dao.UserDao;
import com.web.dao.daoimpl.UserDaoImpl;
import com.web.entity.UserEntity;
import com.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/27.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean add(UserEntity userEntity) {
        return userDao.add(userEntity);
    }

    @Override
    public boolean update(UserEntity userEntity) {
        return userDao.update(userEntity);
    }

    @Override
    public boolean delete(UserEntity userEntity) {
        return userDao.delete(userEntity);
    }

    @Override
    public List<UserEntity> getAll() {
        return userDao.getAll();
    }

    @Override
    public UserEntity getbyId(int userId) {
        return userDao.getbyId(userId);
    }

    @Override
    public UserEntity getbyName(String username) {
        return userDao.getbyName(username);
    }

    @Override
    public boolean login(String username, String password) {
        return userDao.login(username, password);
    }
}
