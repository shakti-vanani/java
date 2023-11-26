import java.util.Random;

public class Random_Class {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNo = r.nextInt(50); // Generates a random integer between 0 (inclusive) and 100 (exclusive)
        System.out.println("Random Number= " + randomNo);
        double doublerandomNo = r.nextDouble(50); // Generates a random double between 0 (inclusive) and 50 (exclusive)
        System.out.println("Random Number= " + doublerandomNo);

    }
}