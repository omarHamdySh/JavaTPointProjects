/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint.TableHandlers;

import com.javatpoint.Beans.Employee;
import com.javatpoint.Beans.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author omarhamdy
 */
public class StoreData {
    //creating configuration object  

    Employee e1;

    public StoreData(Employee e1) {
        this.e1 = e1;
    }
     

    public void save() {
        Configuration cfg = new Configuration();

        cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  

        final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());

        //creating seession factory object  
        SessionFactory factory = cfg.buildSessionFactory(builder.build());

        //creating session object  
        Session session = factory.openSession();

        //creating transaction object  
        Transaction t = session.beginTransaction();

        session.persist(e1);//persisting the object  

        t.commit();//transaction is commited  
        session.close();


    }

}
