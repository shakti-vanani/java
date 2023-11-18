public class do_while_loop {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println("inside do while block Iteration " + (count + 1));
            count++;
        } while (count < 5);
    }
}
