
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
public class Circles {

    public static void main(String[] args) {
        Circle[] list;
        int size;
        Circle target;
        String text;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many circles do you want to create? ");
        size = scan.nextInt();
        list = new Circle[size];

        System.out.println("\nEnter their radius...");
        for (int i = 0; i < size; i++) {
            list[i] = new Circle(scan.nextInt());
        }

        Sorting.insertionSort(list);

        System.out.println("\nSorted list:");
        for (Circle circle : list) {
            System.out.println(circle.getRadius());
        }

        do {
            System.out.print("\nInput the circle you want to search: ");
            target = new Circle(scan.nextInt());

            Comparable found = Searching.binarySearch(list, target);
            if (found != null) {
                System.out.println("Found: " + target.getRadius());
            } else {
                System.out.println("The circle was not found.");
            }

            System.out.print("\nDo you want to search another circle? (y/n): ");
            text = scan.next();
        } while (text.equals("y"));
    }

}
