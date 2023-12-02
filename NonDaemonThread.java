public class NonDaemonThread {
    public static void main(String[] args) {
        Thread nonDaemonThread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Non-Daemon Thread is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        nonDaemonThread1.start();

        // Main thread
        for (int i = 0; i < 3; i++) {
            System.out.println("Main Thread is running.....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main Thread completed, and the program will exit only after the non-daemon thread completes.");
    }
}

