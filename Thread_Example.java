import java.util.Scanner;
class NumberPrinter extends Thread {
    private final int start;
    private final int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

            try {
                // Adding a small delay for demonstration purposes
                Thread.sleep(2000);//sleep for 2 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread_Example {
    public static void main(String[] args) {
        Scanner Scann=new Scanner(System.in);
        System.out.println("Enter a start number=");
        int start=Scann.nextInt();
        System.out.println("Enter a end number=");
        int end=Scann.nextInt();
        Scann.close();
        // Creating two thread 
        NumberPrinter t1 = new NumberPrinter(start,end);
        // NumberPrinter t2 = new NumberPrinter(start,end);
        // Starting the threads
        t1.start();
       // t2.start();
    }
}

