/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Person {
    protected String name;
    protected int yearBirth;
    
    public Person(String name, int yearBirth){
        this.name = name;
        this.yearBirth = yearBirth;
    }
    
    @Override
    public String toString(){
        return "name="+ name +",birthYear="+ yearBirth;
    }
    
    
}
