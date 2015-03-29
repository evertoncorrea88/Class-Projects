//**********************************************************
// Numbers.java
//
// Demonstrates selectionSort on an array of integers.
//**********************************************************

import java.util.Scanner;

public class Numbers {
    //---------------------------------------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    //---------------------------------------------

    public static void main(String[] args) {
        String text;
        Integer[] intList;
        int size;
        Integer target;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }

        Sorting.insertionSort(intList);

        System.out.println("\nSorted list:");
        for (Integer j : intList) {
            System.out.println(j);
        }

        do {
            System.out.print("\nInput the integer you want to search: ");
            target = scan.nextInt();

            Comparable found = Searching.binarySearch(intList, target);
            if (found != null) {
                System.out.println("Found: " + found);
            } else {
                System.out.println("The contact was not found.");
            }

            System.out.print("\nDo you want to search another circle? (y/n): ");
            text = scan.next();
        } while (text.equals("y"));
    }
}
