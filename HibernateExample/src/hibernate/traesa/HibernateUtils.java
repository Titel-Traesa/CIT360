package hibernate.traesa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ctrae
 */
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/** This class sets up the session factory used by the TestDAO class */
public class HibernateUtils {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    // Hibernate 5:
    private static SessionFactory buildSessionFactory() {
        try {
            // Create the ServiceRegistry from hibernate.cfg.xml
            //ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
              //      .configure("hibernate1.cfg.xml").build();
              
            // Create a metadata sources using the specified service registry.
            //Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
        return new Configuration().configure().buildSessionFactory();
            //return metadata.getSessionFactoryBuilder().build();
        } catch (Throwable ex) {

            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }

}

