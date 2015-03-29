// *******************************************************
// Salesperson.java
//
// Represents a sales person who has a first name, last
// name, and total number of sales.
// *******************************************************

public class Salesperson implements Comparable {

    private String firstName, lastName;
    private int totalSales;
    //------------------------------------------------------
    // Constructor: Sets up the sales person object with
    // the given data.
    //------------------------------------------------------

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    //-------------------------------------------
    // Returns the sales person as a string.
    //-------------------------------------------

    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    //-------------------------------------------
    // Returns true if the sales people have
    // the same name.
    //-------------------------------------------

    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) && firstName.equals(((Salesperson) other).getFirstName()));
    }
    //--------------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    //--------------------------------------------------
        /*
     The comparison should be based on total sales; that is, 
     return a negative number if the executing object has total 
     sales less than the other object; return a positive number 
     if the sales are greater; if they have the same sales, use 
     the name of the sales person to break the tie (alphabetical order).
     */

    public int compareTo(Object other) {
        int result;

        if (totalSales > ((Salesperson) other).getSales()) {
            result = 1;
        } else if (totalSales < ((Salesperson) other).getSales()) {
            result = -1;
        } else {
            String otherFirst = ((Salesperson) other).getFirstName();
            String otherLast = ((Salesperson) other).getLastName();
            if (lastName.equals(otherLast)) {
                result = firstName.compareTo(otherFirst);
            } else {
                result = lastName.compareTo(otherLast);
            }
        }
        // Your code here
        return result;
    }
    //-------------------------
    // First name accessor.
    //-------------------------

    public String getFirstName() {
        return firstName;
    }
    //-------------------------
    // Last name accessor.
    //-------------------------

    public String getLastName() {
        return lastName;
    }
    //-------------------------
    // Total sales accessor.
    //-------------------------

    public int getSales() {
        return totalSales;
    }

}
