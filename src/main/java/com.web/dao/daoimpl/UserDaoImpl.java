package com.web.dao.daoimpl;

import com.web.dao.UserDao;
import com.web.entity.UserEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/27.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private Session getSession(){
        return sessionFactory.getCurrentSession();

    }
    @Override
    public boolean add(UserEntity userEntity) {
        Transaction transaction=getSession().beginTransaction();
        getSession().save(userEntity);
        transaction.commit();
        return true;
    }

    @Override
    public boolean update(UserEntity userEntity) {
        Transaction transaction=getSession().beginTransaction();
        getSession().update(userEntity);
        transaction.commit();
        return true;
    }

    @Override
    public boolean delete(UserEntity userEntity) {
        Transaction transaction = getSession().beginTransaction();
        getSession().delete(userEntity);
        transaction.commit();
        return true;
    }

    @Override
    public List<UserEntity> getAll() {
        Transaction transaction = getSession().beginTransaction();
        String hql="from UserEntity ";
        Query query=getSession().createQuery(hql);
        List<UserEntity> userList=query.list();
        transaction.commit();
        return userList;
    }

    @Override
    public UserEntity getbyId(int clientId) {
        Transaction transaction = getSession().beginTransaction();
        String hql="from UserEntity AS client where id= ?";
        Query query=getSession().createQuery(hql).setParameter(0,clientId);
        UserEntity user= (UserEntity) query.uniqueResult();
        transaction.commit();
        return user;
    }

    @Override
    public UserEntity getbyName(String username) {
        UserEntity user=null;
        Transaction transaction = getSession().beginTransaction();
        String hql="from UserEntity AS client where username= ?";
        Query query=getSession().createQuery(hql).setParameter(0,username);
        user = (UserEntity) query.uniqueResult();
        transaction.commit();
        return user;
    }


    @Override
    public boolean login(String username, String password) {
        if (getbyName(username)!=null)
            if(password.equals(getbyName(username).getPassword()))
                return true;
        return false;
    }
}
