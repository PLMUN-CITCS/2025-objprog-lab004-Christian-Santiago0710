import java.util.Scanner;

public class ArithmeticOperationsWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate sum
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Calculate difference
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Calculate product
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Calculate quotient
        int quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);

        // Calculate remainder
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);

        // Calculate expression result
        int expressionResult = sum + quotient;
        System.out.println("Expression Result: " + expressionResult);

        scanner.close();
    }
}
