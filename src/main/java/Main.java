public class Main {

    //Entry point
    public static void main(String[] args) {

        // addTwoIntegers(2,2); (for static methods


        Main main = new Main(); //new instans to access non static method
        int sum = main.addTwoIntegers(2,2);

        System.out.println(sum);
    }

    public int addTwoIntegers(int a, int b) {
        return a + b;

    }
}
