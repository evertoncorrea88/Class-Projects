// *******************************************************************
// TestFib.java
//
// A simple driver that uses the Fib class to compute the
// nth element of the Fibonacci sequence.
// *******************************************************************
import java.util.Scanner;
public class TestFib
{
	public static void main(String[] args)
	{
		int n, f;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		n = scan.nextInt();
		f = fib(n);
		System.out.println("Fib(" + n + ") is " + f);
	}
        
        public static int fib(int n){
            if(n == 0){
                return 0;
            }else if(n == 1){
                return 1;
            }else{
                return fib(n-1) + fib(n-2);
            }
        }
	
}