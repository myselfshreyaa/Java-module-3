import java.util.Scanner;

public class ArrayDivision {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40};

        System.out.println("Enter index (0-3): ");
        int index = sc.nextInt();

        System.out.println("Enter divisor: ");
        int divisor = sc.nextInt();

        try {
            int result = arr[index] / divisor;
            System.out.println("Result: " + result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Array index out of bounds");
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        }

        sc.close();
    }
}
