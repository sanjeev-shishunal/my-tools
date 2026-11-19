import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                valid = false;
                break;
        }

        if (valid) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }

        sc.close();
    }
}

