//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList {

    private MagazineNode list;

    //----------------------------------------------------------------
    //  Sets up an initially empty list of magazines.
    //----------------------------------------------------------------
    public MagazineList() {
        list = null;
    }
    //----------------------------------------------------------------
    //  Creates a new MagazineNode object and adds it to the end of
    //  the linked list.
    //----------------------------------------------------------------

    public void add(Magazine mag) {
        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;
        if (list == null) {
            list = node;
        } else {
            current = list;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void addToFront(Magazine mag) {
        MagazineNode node = new MagazineNode(mag);
        node.next = list;
        list = node;
    }

    public void addToEnd(Magazine mag) {
        MagazineNode newnode = new MagazineNode(mag);
        //if list is empty, this will be the only node in it
        if (list == null) {
            list = newnode;
        } else {
            //make temp point to last thing in list
            MagazineNode temp = list;
            while (temp.next != null) {
                temp = temp.next;
            }
            //link new node into list
            temp.next = newnode;
        }
    }

    public void removeFirst() {
        if (list != null) {
            list = list.next;
        }
    }

    public void removeLast() {
        if (list != null) {
            if (list.next == null) {
                list = null;
            } else {
                MagazineNode previous = list;
                MagazineNode current = list.next;
                while (current.next != null) {
                    previous = current;
                    current = current.next;
                }
                previous.next = null;
            }
        }
    }

    public void print() {
        System.out.println("--------------------");
        System.out.println("List elements: ");
        MagazineNode temp = list;
        while (temp != null) {
            System.out.println(temp.magazine + " ");
            temp = temp.next;
        }
        System.out.println("-----------------------\n");
    }

    //----------------------------------------------------------------
    //  Returns this list of magazines as a string.
    //----------------------------------------------------------------
    public String toString() {
        String result = "";
        MagazineNode current = list;
        while (current != null) {
            result += current.magazine + "\n";
            current = current.next;
        }
        return result;
    }
    //*****************************************************************
    //  An inner class that represents a node in the magazine list.
    //  The public variables are accessed by the MagazineList class.
    //*****************************************************************

    private class MagazineNode {

        public Magazine magazine;
        public MagazineNode next;

        //--------------------------------------------------------------
        //  Sets up the node
        //--------------------------------------------------------------
        public MagazineNode(Magazine mag) {
            magazine = mag;
            next = null;
        }
    }
}
