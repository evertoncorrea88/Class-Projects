
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------

    public static int factorial(int n) throws IllegalArgumentException {
        IllegalArgumentException problem;
        if (n < 0) {
            problem = new IllegalArgumentException("Negative numbers are not valid.");
            throw problem;
        } else if (n > 16) {
            problem = new IllegalArgumentException("Numbers greater than 16 are not valid.");
            throw problem;
        }
        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
