public class Thread_LifeCycle {
    public static void main(String[] args) {
        // New state
        Thread newThread = new Thread(() -> {
            // Runnable state
            System.out.println("Thread is running...");
            try {
                // Timed Waiting state
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Runnable state
        newThread.start();

        try {
            // Main thread in Timed Waiting state
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Main thread in Blocked state
        synchronized (newThread) {
            System.out.println("Main thread acquired the lock.");
        }

        // Waiting state
        synchronized (newThread) {
            newThread.notify();
        }

        try {
            // Main thread in Terminate state
            newThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread completed.");
    }
}