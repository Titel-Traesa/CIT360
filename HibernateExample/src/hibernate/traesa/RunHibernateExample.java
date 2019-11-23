package hibernate.traesa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author traesa titel
 */
import java.util.*;

public class RunHibernateExample {

    public static void main(String[] args) {

        TestDAO t = TestDAO.getInstance();
        List<students> s = t.getStudents();
        for (students i : s) {
            System.out.println(i);
        }
        
        t.addStudent(9,"James Monroe",6);
        List<students> s2 = t.getStudents();
        for (students i : s2) {
            System.out.println(i);
        }
        

        System.out.println(t.getStudent(1));
        
    }
}
