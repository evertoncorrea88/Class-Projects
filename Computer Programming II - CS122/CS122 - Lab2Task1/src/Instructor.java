/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int yearBirth, double salary ) {
        super(name, yearBirth);
        this.salary = salary;
    }
    
    public String toString(){
        return "name="+ name +",birthYear="+ yearBirth +",salary="+ salary;
    }
}
