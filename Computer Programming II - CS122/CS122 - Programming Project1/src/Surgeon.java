/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Surgeon extends Doctor {
    
    protected boolean operating;

    public Surgeon(String empName, int empNumber, String specialty, boolean operating) {
        super(empName, empNumber, specialty);
        this.operating = operating;
    }
    
    @Override
    public String toString(){
        return name + "\t" + number + "\t" + specialty + "\tOperating: " + operating;
    }
    
    public void operate(){
        if(operating){
            System.out.println(name + " is operating now.");
        }else{
            System.out.println(name + " is not operating now.");
        }
    }    
}
