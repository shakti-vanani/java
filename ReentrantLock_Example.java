import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Calculation {
    private int count = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        // Non-critical section

        lock.lock();
        try {
            // Critical section
            count++;
        } finally {
            lock.unlock();
        }

        // Non-critical section
    }

    public int getCount() {
        return count;
    }
}

public class ReentrantLock_Example {
    public static void main(String[] args) {
        Calculation calculation1 = new Calculation();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 2000; i++) {
                calculation1.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                calculation1.increment();
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

        System.out.println("Count with ReentrantLock: " + calculation1.getCount()); // Expected: 2000
    }
}
