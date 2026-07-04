// Problem: Find HCF and LCM

// My Solution

import java.util.Scanner;

public class HCFAndLCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Store original values
        int originalA = a;
        int originalB = b;

        // Euclidean Algorithm to find HCF
        while (b != 0) {

            int remainder = a % b;

            a = b;
            b = remainder;
        }

        int hcf = a;
        int lcm = (originalA * originalB) / hcf;

        System.out.println("The HCF of " + originalA + " and " + originalB + " is: " + hcf);
        System.out.println("The LCM of " + originalA + " and " + originalB + " is: " + lcm);

        sc.close();
    }
}

/*
Problem: Find HCF and LCM of Two Numbers

Approach

This program finds the Highest Common Factor (HCF) of two numbers
using the Euclidean Algorithm. Once the HCF is found, the Least
Common Multiple (LCM) is calculated using the formula:

LCM = (First Number × Second Number) / HCF

Key Logic

- Read two integers from the user.
- Store the original values because the Euclidean Algorithm
  modifies the input numbers.
- Repeatedly replace:
    - the larger number with the smaller number.
    - the smaller number with the remainder.
- Continue until the remainder becomes 0.
- The last non-zero value is the HCF.
- Calculate the LCM using:
    LCM = (First Number × Second Number) / HCF

Example

Input:
48
18

Output:
The HCF of 48 and 18 is: 6
The LCM of 48 and 18 is: 144

Example 2

Input:
12
30

Output:
The HCF of 12 and 30 is: 6
The LCM of 12 and 30 is: 60

Time Complexity:
O(log(min(a, b)))

Why?
- The Euclidean Algorithm repeatedly replaces the larger
  number with the remainder.
- The remainder becomes significantly smaller after each
  iteration.
- Therefore, the number of iterations grows logarithmically
  with the smaller input value.

Space Complexity:
O(1)

Why?
- The program uses only a few integer variables:
    - a
    - b
    - originalA
    - originalB
    - remainder
    - hcf
    - lcm
- No additional data structures such as arrays, lists,
  or recursion are used.
- Hence, the memory usage remains constant.

*/