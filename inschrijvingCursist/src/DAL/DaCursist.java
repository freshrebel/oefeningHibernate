/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BO.*;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author Arno
 */
public class DaCursist
{
    public void insert(Cursist cursist)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(cursist);
        session.getTransaction().commit();
    }
    
    public void update(Cursist cursist)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(cursist);
        session.getTransaction().commit();
    }
    
    public void delete(Cursist cursist)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(cursist);
        session.getTransaction().commit();
    }
    
//    public Cursist SelectOne(int id)
//    {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Query q = session.createQuery("from tbl_cursist where id = " + id);
//    }
}
