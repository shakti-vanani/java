public class tostringmethod {
    private int value;

    public tostringmethod(int val) {
        this.value = val;
    }

    @Override
    public String toString() {
        return "tostringmethod{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
        tostringmethod myObj = new tostringmethod(50);
        System.out.println(myObj.toString());
    }
}
