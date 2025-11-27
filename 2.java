import java.util.Scanner;

public class DivisionProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompting the user for two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Performing the division
            int result = num1 / num2;
            System.out.println("The result of division is: " + result);
        } catch (ArithmeticException e) {
            // Handling division by zero error
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            // Catching other possible exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Closing the scanner
            scanner.close();
        }
    }
}
