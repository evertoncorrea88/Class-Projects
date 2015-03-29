//********************************************************************
//  Hospital.java       Authors: Lewis/Loftus
//
//  Solution to Programming Project 9.2 
//********************************************************************

public class Hospital {
    //-----------------------------------------------------------------
    //  Creates several objects from classes derived from
    //  HospitalEmployee.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        //Part1: 
        System.out.println("Part1");
        HospitalEmployee vito = new HospitalEmployee("Vito", 123);
        Doctor michael = new Doctor("Michael", 234, "Heart");
        Surgeon vincent = new Surgeon("Vincent", 645, "Brain", true);
        Nurse sonny = new Nurse("Sonny", 789, 6);
        // print the employees
        System.out.println(vito);
        System.out.println(michael);
        System.out.println(vincent);
        System.out.println(sonny);
        // invoke the specific methods of the objects
        vito.work();
        michael.diagnose();
        vincent.operate();
        sonny.assist();

        //Part2:
        System.out.println("\nParte2");
        HospitalEmployee employ1 = new HospitalEmployee("Everton", 321);
        HospitalEmployee employ2 = new HospitalEmployee("Everton", 321);
        if (employ1.equals(employ2)) {
            System.out.println("They are same employee.");
        } else {
            System.out.println("They are different employees.");
        }

    }
}
