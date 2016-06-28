package com.web.dao.daoimpl;

import com.web.dao.ClientDao;
import com.web.entity.ClientEntity;
import com.web.entity.DeviceEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.transform.RootEntityResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cnhhdn on 2016/6/24.
 */
@Repository
public class ClientDaoImpl implements ClientDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private Session getSession(){
        return sessionFactory.getCurrentSession();

    }
    @Override
    public boolean add(ClientEntity clientEntity) {
        Transaction transaction=getSession().beginTransaction();
        try{
        getSession().save(clientEntity);
        transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return true;
    }

    @Override
    public boolean update(ClientEntity clientEntity) {
        Transaction transaction=getSession().beginTransaction();
        try{
            getSession().update(clientEntity);
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return true;
    }

    @Override
    public boolean delete(int clientId) {
        Transaction transaction = getSession().beginTransaction();
        String hql="delete from ClientEntity where clientId=?";
        try{
            Query query=getSession().createQuery(hql).setParameter(0,clientId);
            query.executeUpdate();
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return true;
    }

    @Override
    public List<ClientEntity> getAll() {
        List<ClientEntity> clientList=null;
        Transaction transaction = getSession().beginTransaction();
        String hql="from ClientEntity";
        try{
            Query query=getSession().createQuery(hql);
            clientList=query.list();
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return clientList;
    }

    @Override
    public ClientEntity getbyId(int clientId) {
        Transaction transaction = getSession().beginTransaction();
        String hql="from ClientEntity AS client where clientId= ?";
        ClientEntity client=null;
        try{
            Query query=getSession().createQuery(hql).setParameter(0,clientId);
            client= (ClientEntity) query.uniqueResult();
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return client;
    }


    @Override
    public List<DeviceEntity> getDevicebyId(int clientId) {
        Transaction transaction = getSession().beginTransaction();
        String hql="from ClientEntity AS client inner join client.devicesByClientId where client.clientId= ?";
        List<DeviceEntity> list=null;
        try{
            Query query=getSession().createQuery(hql).setParameter(0,clientId);
            query.setResultTransformer(RootEntityResultTransformer.INSTANCE);
            list= query.list();
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return list;
    }


}
