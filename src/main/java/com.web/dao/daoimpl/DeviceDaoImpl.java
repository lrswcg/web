package com.web.dao.daoimpl;

import com.web.dao.DeviceDao;
import com.web.entity.DeviceEntity;
import com.web.entity.ClientEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/28.
 */
@Repository
public class DeviceDaoImpl implements DeviceDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private Session getSession(){
        return sessionFactory.getCurrentSession();

    }
    @Override
    public boolean add(DeviceEntity DeviceEntity) {
        Transaction transaction=getSession().beginTransaction();
        try{
            getSession().save(DeviceEntity);
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return true;
    }

    @Override
    public boolean update(DeviceEntity DeviceEntity) {
        Transaction transaction=getSession().beginTransaction();
        try{
            getSession().update(DeviceEntity);
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return true;
    }

    @Override
    public boolean delete(int repairId) {
        Transaction transaction = getSession().beginTransaction();
        String hql="delete from DeviceEntity where repairId=?";
        try{
            Query query=getSession().createQuery(hql).setParameter(0,repairId);
            query.executeUpdate();
            transaction.commit();
        } catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return true;
    }

    @Override
    public List<DeviceEntity> getAll() {
        List<DeviceEntity> deviceList=null;
        Transaction transaction = getSession().beginTransaction();
        String hql="from DeviceEntity";

        try{
            Query query=getSession().createQuery(hql);
            deviceList=query.list();
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return deviceList;
    }

    @Override
    public DeviceEntity getbyId(int repairId) {
        Transaction transaction = getSession().beginTransaction();
        String hql="from DeviceEntity AS device where repairId= ?";
        DeviceEntity device=null;
        try{
            Query query=getSession().createQuery(hql).setParameter(0,repairId);
            device= (DeviceEntity) query.uniqueResult();
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return device;
    }


    @Override
    public ClientEntity getClientbyId(int repairId) {
        Transaction transaction = getSession().beginTransaction();
        String hql="FROM DeviceEntity as device inner join device.clientByClientId where device.repairId= ?";
        ClientEntity client=null;
        try{
            Query query=getSession().createQuery(hql).setParameter(0,repairId);
            client= (ClientEntity) query.uniqueResult();
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        return client;
}
}
