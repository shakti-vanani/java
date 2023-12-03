class Calculations{
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Synchronized_Method {
    public static void main(String[] args) {
        Calculation counter1 = new Calculation();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                counter1.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                counter1.increment();
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

        System.out.println("Count with synchronization: " + counter1.getCount()); 
    }
}