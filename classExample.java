import java.util.Scanner;
public class classExample {
    // Create a Scanner object to read input from the user
    Scanner scanner = new Scanner(System.in);
         
         int n1;
         int n2;
    // Method
    public void get() {
        
            System.out.println("enter n1=");
             // Read the first number from the user
             n1=scanner.nextInt();             
            System.out.println("enter n2=");
             // Read the first number from the user
            n2 = scanner.nextInt();
    }
    //method
    public void put()
    {    
          System.out.println("value of n1="+n1);
          System.out.println("value of n2="+n2);
    }
    public void sum()
    {
          System.out.println("sum of n1 and n2="+(n1+n2));
    }
    public static void main(String[] args) {
        // Creating an object of classExample
        classExample obj=new classExample();
        // Accessing fields and methods of the object
        obj.get();
        obj.put();
        obj.sum();      

    }

}
