package JAVA;

// Problem: Check Leap Year

// My Solution

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }

        sc.close();
    }
}

/* Approach

This solution determines whether a given year is a leap year
based on the Gregorian calendar rules.

Leap Year Rules

- A year is a leap year if it is divisible by 4.
- However, if it is divisible by 100, it is not a leap year.
- An exception is when the year is also divisible by 400,
  in which case it is a leap year.

Key Logic

- Check if the year is divisible by 4 and not divisible by 100.
- OR check if the year is divisible by 400.
- If either condition is true, the year is a leap year.
- Otherwise, it is not.

Example

Input:
year = 2024

2024 % 4 = 0
2024 % 100 != 0

Output:
The year 2024 is a leap year.

Example 2

Input:
year = 1900

1900 % 100 = 0
1900 % 400 != 0

Output:
The year 1900 is not a leap year.

Time Complexity:
O(1)

Why?
- The algorithm performs a fixed number of modulo (%) operations
  and comparison checks.
- The number of operations does not increase with the value of the year.
- Therefore, the execution time remains constant.

Space Complexity:
O(1)

Why?
- Only one integer variable (year) and a Scanner object are used.
- No additional data structures such as arrays, lists, or recursion
  are required.
- Hence, the memory usage remains constant regardless of the input size.

*/