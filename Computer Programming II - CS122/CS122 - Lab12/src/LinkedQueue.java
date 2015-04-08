//***********************************************************
// LinkedQueue.java
// A linked-list implementation of the classic FIFO queue interface.
//***********************************************************

public class LinkedQueue {

    private Node front;
    private int numElements;
    //---------------------------------------------
    // Constructor; initializes the front and back pointers
    // and the number of elements.
    //---------------------------------------------

    public LinkedQueue() {
        numElements = 0;
        front = null;
    }
    //---------------------------------------------
    // Puts item on end of queue.
    //---------------------------------------------

    public void enqueue(Object item) {
        Node node = new Node(item);
        if (numElements == 0) {
            front = node;
        } else {
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        numElements++;
    }
    //---------------------------------------------
    // Removes and returns object from front of queue.
    //---------------------------------------------

    public Object dequeue() {
        if (numElements == 0) {
            System.out.println("The queue is empty.");
            return null;
        } else {
            Node temp = front;
            front = front.next;
            numElements--;
            return temp;
        }
    }
    //---------------------------------------------
    // Returns true if queue is empty.
    //---------------------------------------------

    public boolean isEmpty() {
        if (numElements == 0) {
            return true;
        } else {
            return false;
        }
    }

    //---------------------------------------------
    // Returns the number of elements in the queue.
    //---------------------------------------------
    public int size() {
        return numElements;
    }
    //---------------------------------------------
    // Returns a string containing the elements of the queue
    // from first to last
    //---------------------------------------------

    public String toString() {
        String result = "\n";
        Node temp = front;
        while (temp != null) {
            result += temp.element + "\n";
            temp = temp.next;
        }
        return result;
    }

    private class Node {

        public Node next;
        public Object element;

        public Node(Object element) {
            next = null;
            this.element = element;
        }

        public String toString() {
            return element + "";
        }
    }
}
