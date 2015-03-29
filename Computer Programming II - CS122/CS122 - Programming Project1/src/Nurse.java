/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Nurse extends HospitalEmployee{
    
    protected int patients;

    public Nurse(String empName, int empNumber, int patients) {
        super(empName, empNumber);
        this.patients = patients;
    }
    
    @Override
    public String toString(){
      return name + "\t" + number + "\thas " + patients + " patients.";
    }

    public void assist(){
      System.out.println (name + " is a nurse with " + patients + " patients." );
    }
}
