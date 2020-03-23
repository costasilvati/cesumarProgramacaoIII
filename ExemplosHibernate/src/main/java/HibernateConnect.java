
import connection.HibernateUtil;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julianacostasilva
 */
public class HibernateConnect {
    public static void main(String[] args) {
        Session session = null;
        session = 
                HibernateUtil.getSessionFactory().openSession();
        System.out.println("Conectou!");
        session.close();
    }
   
}
