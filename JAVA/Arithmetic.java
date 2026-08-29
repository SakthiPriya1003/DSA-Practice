import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.println("Enter the Operator (+ , - , * , /): ");
        char op = sc.next().charAt(0);

        double result;

        if (op == '+') {
            result = a + b;
        }
        else if (op == '-') {
            result = a - b;
        }
        else if (op == '*') {
            result = a * b;
        }
        else {
            result = a / b;
        }

        System.out.println(result);

        sc.close();
    }
}

/*Approach

This program performs basic arithmetic operations on two numbers using if-else conditions.

Key Logic

- Take two numbers and an operator as input.
- Check the operator using if-else conditions.
- Perform +, -, *, or / accordingly.
- Display the calculated result.

Example

Input:
a = 10
b = 5
op = *

Output:
50.0

Time Complexity:
O(1)

Space Complexity:
O(1)
*/