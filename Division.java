import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static int quotient(int c, int d) throws ArithmeticException {
        return c / d;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean repeat = true;

        do {
            try {
                int a, b, result;
                
                System.out.println("Input two integers:");
                a = input.nextInt();
                b = input.nextInt();
                
                result = quotient(a, b);
                System.out.println("Result=" + result);
                
                repeat = false;
                
            } catch (InputMismatchException e) {
                System.out.println("Exception caught: Input Error");
                System.out.println("You must enter an integer. Please try again");
                
            } catch (ArithmeticException e1) {
                System.out.println("Exception caught: Division by zero");
                System.out.println("Zero is invalid denominator. Please try again");
            }
        } while (repeat);
    }
}