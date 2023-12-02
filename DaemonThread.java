public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread1 = new Thread(() -> {
            while (true) {
                System.out.println("Daemon Thread is running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        daemonThread1.setDaemon(true);
        daemonThread1.start();

        // Main thread
        for (int i = 0; i < 3; i++) {
            System.out.println("Main Thread is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main Thread completed, and the program may exit.");
    }
}
