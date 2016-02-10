/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.base.dao;

import com.base.models.Teachers;
import com.base.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Class is for making CRUD operations into teacher table in database
 * @author Ohjelmistokehitys
 */
public class TeacherDAO {
    /**
     * Method adds new teacher into database
     * @param teach
     * @throws java.lang.Exception
     */
    public static void addTeacher(Teachers teach) throws Exception{
        //Create session to database
        Session session = HibernateUtil.getSessionFactory().openSession();
        // when writing to database transaction needed beside session
        Transaction transaction = session.beginTransaction();
        session.save(teach);
        //end transaction
        transaction.commit();
        //Release session
        session.close();
    }
}
