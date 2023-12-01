class Counter {
    private int count = 0;
    private Object lockObject = new Object();

    public void increment() {
        // Non-critical section

        synchronized (lockObject) {
            // Critical section
            count++;
        }

        // Non-critical section
    }

    public int getCount() {
        return count;
    }
}

public class Synchronized_Block {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count with synchronization: " + counter.getCount()); // Expected: 2000
    }
}
