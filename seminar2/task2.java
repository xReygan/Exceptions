package seminar2;

public class task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1, 5, 6, 8, 7, 9, 2, 1, 9};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
