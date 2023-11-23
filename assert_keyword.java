public class assert_keyword {
    public static void main(String[] args) {
        int value = 10;
        assert value > 0 : "Value should be positive";
        System.out.println("Value is: " + value);
    }
}