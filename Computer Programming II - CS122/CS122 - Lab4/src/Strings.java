
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
public class Strings {

    public static void main(String[] args) {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];
        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.next();
        }
        Sorting.selectionSort(stringList);
        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.print(stringList[i] + " ");
        }
        System.out.println();
    }
}
