
import java.util.Vector;

public class TestThread {

    public static void main(String args[]) {

//      Task1
        Vector<String> vector = new Vector<String>(5, 3);
        for (int i = 1; i <= 10; i++) {
            vector.add("task" + i);
        }

        System.out.println("Vector size: " + vector.size());
        System.out.println("Vector capacity: " + vector.capacity());

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i).toString());
        }

//      Task2    
        ThreadDemo T1 = new ThreadDemo("Thread-1", 1, 100);
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread-2", 101, 200);
        T2.start();
    }
}
