import java.util.Scanner;

public class basic_try_and_catch {

    public static int divide(int dividend, int divisor) {

        if (divisor == 0) {

            throw new ArithmeticException("Division by zero");
        }

        return dividend / divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to divide:");
        int div = sc.nextInt();
        int divisor = sc.nextInt();

        try {

            int r = divide(div, divisor);
            System.out.println("Result of division: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program execution complete.");
            // scanner.close();
        }
    }
}
