class CloneMethod implements Cloneable {
    private int value;

    public CloneMethod(int val) {
        this.value = val;
    }
    public void display(){
        System.out.println("value="+value);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Default cloning (shallow copy)
    }

    public static void main(String[] args) {
        try {
            // Create an object
            CloneMethod originalObject = new CloneMethod(42);

            // Clone the object
            CloneMethod clonedObject = (CloneMethod) originalObject.clone();
            // Print original and cloned objects
            System.out.println("Original Object: " + originalObject);
            System.out.println("Cloned Object: " + clonedObject);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
