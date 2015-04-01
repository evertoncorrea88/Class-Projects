//**********************************************************
// TestQueue
// A driver to test the methods of the QueueADT implementations.
//**********************************************************

public class TestQueue {

    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        System.out.println("\nEnqueuing chocolate, cake, pie, truffles:");
        q.enqueue("chocolate");
        q.enqueue("cake");
        q.enqueue("pie");
        q.enqueue("truffles");
        System.out.println("\nHere's the queue: " + q);

        // put your code here: print the size of the queue
        System.out.println("The size of the queue is " + q.size());

        System.out.println("\nDequeuing two...");

        //put your code here: call the dequeue method twice and print out the dequeued items
        System.out.println("Dequeue item: " + q.dequeue());
        System.out.println("Dequeue item: " + q.dequeue());

        System.out.println("\nHere's the queue again: " + q);
        System.out.println("Now it contains " + q.size() + " items.");
        System.out.println("\nDequeuing everything in queue");

        //put your code here: dequeue everything in the queue now using a loop
        while (!q.isEmpty()) {
            q.dequeue();
        }

        System.out.println("\nNow it contains " + q.size() + " items.");
        if (q.isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Queue is not empty -- why not??!!");
        }
    }
}
