import java.util.Scanner;

public class DivideByZeroExceptionHandling
{
    public static int quotient(int numerator, int denominator) 
        throws ArithmeticException
    {
        if (denominator == 0)
            throw new ArithmeticException("Possible division by zero");
        return numerator / denominator;
    } 

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();

        int result; 

        try
        {
            result = quotient(numerator, denominator);
            System.out.printf("Result: %d / %d = %d\n", numerator,
                denominator, result);
        } 
        catch (ArithmeticException arithmeticException)
        {
            System.err.printf("\nException: %s\n", arithmeticException);
            System.out.println("You must enter new integers. Please try again.");
        } 
    } 
} 