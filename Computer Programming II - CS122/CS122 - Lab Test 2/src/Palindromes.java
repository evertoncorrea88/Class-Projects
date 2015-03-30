
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Everton
 */
public class Palindromes {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.next();
        boolean result = palindrome(word);
        if(result){
            System.out.println("This word is palindrome.");
        }else{
            System.out.println("This word is not palindrome");
        }
    }

    public static boolean palindrome(String word) {
        boolean result = false;
        if (word.length() <= 1) {
            result = true;
        } else {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                result = palindrome(word.substring(1, word.length() - 1));
            } else {
                return false;
            }
        }
        return result;
    }
}
