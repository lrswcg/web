package com.web.dao.daoimpl;

import com.web.dao.CostDao;
import com.web.entity.CostEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cnhhdn on 2016/6/26.
 */
@Repository
public class CostDaoImpl implements CostDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private Session getSession(){
        return sessionFactory.getCurrentSession();

    }
    @Override
    public boolean add(CostEntity costEntity) {
        Transaction transaction=getSession().beginTransaction();
        getSession().save(costEntity);
        transaction.commit();
        return true;
    }

    @Override
    public boolean update(CostEntity costEntity) {
        Transaction transaction=getSession().beginTransaction();
        getSession().update(costEntity);
        transaction.commit();
        return true;
    }

    @Override
    public boolean delete(CostEntity costEntity) {
        Transaction transaction = getSession().beginTransaction();
        getSession().delete(costEntity);
        transaction.commit();
        return true;
    }

    @Override
    public List<CostEntity> getAll() {
        Transaction transaction = getSession().beginTransaction();
        String hql="from CostEntity";
        Query query=getSession().createQuery(hql);
        List<CostEntity> costList=query.list();
        transaction.commit();
        return costList;
    }

    @Override
    public CostEntity getbyId(int repairId) {
        Transaction transaction = getSession().beginTransaction();
        String hql="from CostEntity AS cost where repairId= ?";
        Query query=getSession().createQuery(hql).setParameter(0,repairId);
        CostEntity costEntity= (CostEntity) query.uniqueResult();
        transaction.commit();
        return costEntity;
    }
}
