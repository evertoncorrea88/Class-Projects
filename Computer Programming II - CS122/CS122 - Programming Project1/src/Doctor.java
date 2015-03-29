/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Doctor extends HospitalEmployee{
    
    protected String specialty;

    public Doctor(String empName, int empNumber, String specialty) {
        super(empName, empNumber);
        this.specialty = specialty;
    }
    
    @Override
    public String toString(){
        return name + "\t" + number + "\t" + specialty;        
    }
    
    public void diagnose(){
        System.out.println(name + " is a(n) " + specialty + " doctor.");
    }
}
