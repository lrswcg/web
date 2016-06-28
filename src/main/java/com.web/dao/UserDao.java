package com.web.dao;

import com.web.entity.UserEntity;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/27.
 */
public interface UserDao {
    boolean add(UserEntity userEntity);
    boolean update(UserEntity userEntity);
    boolean delete(UserEntity userEntity);
    List<UserEntity> getAll();
    UserEntity getbyId(int clientId);
    UserEntity getbyName(String username);
    boolean login(String username,String password);
}
