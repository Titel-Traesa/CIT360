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

import javax.persistence.*;

@Entity
@Table(name="student")
public class students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name= "name")
    private String name;
            
    @Column(name="grade")
    private int grade;
    
    
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setFirstName(String name){
        this.name=name;
    }
        
    public int getGrade(){
        return grade;
    }
    
    public void setGrade(int grade){
        this.grade = grade;
    }
    
    public String toString(){
        return Integer.toString(id) + " " + name + " " + Integer.toString(grade);
    }
}
