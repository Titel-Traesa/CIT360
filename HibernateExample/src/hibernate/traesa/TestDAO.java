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
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

/** TestDAO implemented using a singleton pattern
 *  Used to get customer data from my MYSQL database*/
public class TestDAO {

    SessionFactory factory = null;
    Session session = null;

    private static TestDAO single_instance = null;

    private TestDAO()
    {
        factory = HibernateUtils.getSessionFactory();
    }

    /** This is what makes this class a singleton.  You use this
     *  class to get an instance of the class. */
    public static TestDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new TestDAO();
        }

        return single_instance;
    }

    /** Used to get more than one customer from database
     *  Uses the OpenSession construct rather than the
     *  getCurrentSession method so that I control the
     *  session.  Need to close the session myself in finally.*/
    public List<students> getStudents() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernate.traesa.students";
            List<students> sl = (List<students>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return sl;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    /** Used to get a single customer from database */
    public students getStudent(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from hibernate.traesa.students where id=" + Integer.toString(id);
            students s = (students)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return s;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
    
    public void addStudent(int id, String name, int grade){
        try{
            session=factory.openSession();
            session.getTransaction().begin();
            students newStudent = new students(id,name,grade);
            session.saveOrUpdate(newStudent);
            session.getTransaction().commit();
        }
        catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        finally{
        session.close();
                }
    }
     

}

