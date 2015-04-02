
import java.util.Scanner;

//*******************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//*******************************************************************
public class MagazineRack {

    //----------------------------------------------------------------
    //  Creates a MagazineList object, adds several magazines to the
    //  list, then prints it.
    //----------------------------------------------------------------

    private static Scanner scan;
    private static MagazineList rack;

    public static void main(String[] args) {
        rack = new MagazineList();

        rack.add(new Magazine("Time"));
        rack.add(new Magazine("Woodworking Today"));
        rack.add(new Magazine("Communications of the ACM"));
        rack.add(new Magazine("House and Garden"));
        rack.add(new Magazine("GQ"));

        System.out.println(rack);

        scan = new Scanner(System.in);
        printMenu();
        int choice = scan.nextInt();
        while (choice != 0) {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
    }
    //----------------------------------------
    // Does what the menu item calls for.
    //----------------------------------------

    public static void dispatch(int choice) {
        Magazine newVal;
        switch (choice) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1: //add to front
                System.out.println("Add magazine to front.\nEnter the magazine name:");
                newVal = new Magazine(scan.next());
                rack.addToFront(newVal);
                break;
            case 2: //add to end
                System.out.println("Add magazine to end.\nEnter the magazine name:");
                newVal = new Magazine(scan.next());
                rack.addToEnd(newVal);
                break;
            case 3: //remove first 
                System.out.println("Remove first magazine.");
                rack.removeFirst();
                break;
            case 4: //remove last
                System.out.println("Remove last magazine.");
                rack.removeLast();
                break;
            case 5: //print list
                rack.print();
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    //-----------------------------------------
    // Prints the user's choices
    //-----------------------------------------

    public static void printMenu() {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Add a magazine to the front of the list");
        System.out.println("2: Add a magazine to the end of the list");
        System.out.println("3: Remove a magazine from the front of the list");
        System.out.println("4: Remove a magazine from the end of the list");
        System.out.println("5: Print the list");
        System.out.print("\nEnter your choice: ");
    }
}
