public class modifier {
    // Public variable accessible from outside the class
    public int publicVar = 10;
    // private variable accessible only within the class
    private int i=20;
    // Public method accessible from outside the class
    public void publicdemo() {
        System.out.println("This is a public method="+publicVar);
    }
     // Private method accessible only within the class
    public void privatedemo(){
        System.out.println("This is a private Method."+i);
    }
    public static void main(String[] args) {
        modifier obj = new modifier();
        // Accessing public members
        System.out.println("Public Variable: " + obj.publicVar);
        obj.publicdemo();
        /*  Accessing private members (not allowed outside the class)
         System.out.println("Private Variable: " + obj.privateVariable); //Compilation error
         obj.privateMethod();  //Compilation error*/
    }
}