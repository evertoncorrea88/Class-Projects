/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Student extends Person {
    private String major; 

    public Student(String name, int yearBirth, String major) {
        super(name, yearBirth);
        this.major = major;
    }
    
    public String toString(){
        return "name="+ name +",birthYear="+ yearBirth +",major="+ major;
    }
    
}
