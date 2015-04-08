
class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;
    private int start;
    private int end;

    ThreadDemo(String name, int start, int end) {
        threadName = name;
        System.out.println("Creating " + threadName);
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        System.out.println("Summation result: " + sum);
        System.out.println("Thread " + threadName + " exiting.");
    }

    @Override
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
