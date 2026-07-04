import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of the two numbers is: " + sum);

        sc.close();
    }
}

/*
Problem: Sum of Two Numbers

Approach

This program reads two integers from the user,
calculates their sum, and displays the result.

Key Logic

- Read the first integer.
- Read the second integer.
- Add both integers.
- Display the sum.

Example

Input:
10
20

Output:
The sum of the two numbers is: 30

Example 2

Input:
567
890

Output:
The sum of the two numbers is: 1457

Time Complexity:
O(1)

Why?
- The program performs a fixed number of operations:
  - Two input operations
  - One addition operation
  - One output operation
- The number of operations does not depend on the input values.
- Therefore, the execution time remains constant.

Space Complexity:
O(1)

Why?
- The program uses only three integer variables:
  - num1
  - num2
  - sum
- No additional data structures such as arrays, lists,
  or recursion are used.
- Hence, the memory usage remains constant regardless of the input size.

*/