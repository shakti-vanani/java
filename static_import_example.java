import static java.lang.Math.*;

public class static_import_example{
    public static void main(String[] args) {
        // Using Math class with static import
        double ans1 = sqrt(100.0);
        double ans2 = pow(3.0,4.0);
        int ans3=max(40,50);

        System.out.println("Square root: " + ans1);
        System.out.println("3^3: " + ans2);
        System.out.println("maximum no="+ans3);
    }
}