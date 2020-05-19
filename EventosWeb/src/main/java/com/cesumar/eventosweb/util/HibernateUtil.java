/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesumar.eventosweb.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author julianacostasilva
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration conf = new Configuration();
            conf.configure("hibernate.cfg.xml");
            StandardServiceRegistryBuilder serviceRegist
                    = new StandardServiceRegistryBuilder();
            serviceRegist.applySettings(conf.getProperties());
            StandardServiceRegistry service = serviceRegist.build();
            return conf.buildSessionFactory(service);
        } catch (Throwable e) {
            System.out.println("Criação Inicial do objeto SessionFactory Falhou!" + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}

