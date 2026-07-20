// Problem: Find Simple Interest

// My Solution

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Time: ");
        double time = sc.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * time * rate) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);

        sc.close();
    }
}

/*
Problem: Find Simple Interest

Approach

This program calculates the Simple Interest (SI) by taking the
Principal amount (P), Time (T), and Rate of Interest (R) as input
from the user. It uses the standard Simple Interest formula.

Formula

Simple Interest = (Principal × Time × Rate) / 100

Key Logic

- Read the Principal amount from the user.
- Read the Time period.
- Read the Rate of Interest.
- Apply the Simple Interest formula:
    SI = (P × T × R) / 100
- Display the calculated Simple Interest.

Example 1

Input:
Principal = 1000
Time = 2
Rate = 5

Output:
The Simple Interest is: 100.0

Example 2

Input:
Principal = 5000
Time = 3
Rate = 7

Output:
The Simple Interest is: 1050.0

Time Complexity:
O(1)

Why?
- The program performs a fixed number of input operations.
- It uses only one arithmetic calculation.
- No loops or recursive calls are involved.
- Therefore, the execution time remains constant regardless of the input values.

Space Complexity:
O(1)

Why?
- The program uses only a few variables:
    - principal
    - time
    - rate
    - simpleInterest
- No additional data structures such as arrays, lists,
  or recursion are used.
- Hence, the memory usage remains constant.

*/