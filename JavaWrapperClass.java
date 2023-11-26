public class JavaWrapperClass {
    public static void main(String[] args) {
        // Creating wrapper objects
        Integer iObj = Integer.valueOf(40); // Wrapping an int
        Double dObj = Double.valueOf(31.14); // Wrapping a double
        Character cObj = Character.valueOf('B'); // Wrapping a char
        Boolean bObj = Boolean.valueOf(true); // Wrapping a boolean

        // Extracting primitive values from wrapper objects
        int intVal = iObj.intValue();
        double doubleVal = dObj.doubleValue();
        char charVal = cObj.charValue();
        boolean boolVal = bObj.booleanValue();

        // Autoboxing (automatic conversion of primitives to objects)
        Long lObj = 100L; // Autoboxing of long

        // Unboxing (automatic conversion of objects to primitives)
        int anotherIntValue = Integer.valueOf(10); // Unboxing to int

        // Printing values
        System.out.println("Integer Object= " + iObj);
        System.out.println("Unwrapped int Value=" + intVal);
        System.out.println("Double Object=" + dObj);
        System.out.println("Unwrapped double Value= " + doubleVal);
        System.out.println("Character Object= " + cObj);
        System.out.println("Unwrapped char Value= " + charVal);
        System.out.println("Boolean Object= " + bObj);
        System.out.println("Unwrapped boolean Value= " + boolVal);
        System.out.println("Autoboxed Long Object= " + lObj);
        System.out.println("Unboxed int Value= " + anotherIntValue);
    }
}
