import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        // Keep running while user wants to continue
        while (again.equalsIgnoreCase("y")) {
            // Ask user for two numbers
            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            // Ask user for the operation
            System.out.print("Choose operation (+, -, *, /): ");
            String op = input.next();

            double result = 0;
            boolean valid = true;

            // Perform the operation
            if (op.equals("+")) {
                result = num1 + num2;
            } else if (op.equals("-")) {
                result = num1 - num2;
            } else if (op.equals("*")) {
                result = num1 * num2;
            } else if (op.equals("/")) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    valid = false;
                }
            } else {
                System.out.println("Invalid operation!");
                valid = false;
            }

            // Show result if valid
            if (valid) {
                System.out.println("Result: " + result);
            }

            // Ask if user wants to continue
            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.next();
        }

        System.out.println("Thank you for using the calculator.");
        input.close();
    }
}