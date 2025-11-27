import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Ask for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform addition
        double sum = num1 + num2;
        
        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
