// Problem: Take a number as input and print the multiplication table for it.

// My Solution
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which you want the multiplication table: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i * num));
        }

        sc.close();
    }
}

/*
Problem: Multiplication Table

Approach

This program reads an integer from the user and prints
its multiplication table from 1 to 10.

Key Logic

- Read the number from the user.
- Use a for loop to iterate from 1 to 10.
- Multiply the number by the loop variable.
- Display the multiplication table in a readable format.

Example

Input:
5

1 x 5 = 5
2 x 5 = 10
3 x 5 = 15
4 x 5 = 20
5 x 5 = 25
6 x 5 = 30
7 x 5 = 35
8 x 5 = 40
9 x 5 = 45
10 x 5 = 50

Time Complexity:
O(1)

Why?
- The loop always executes exactly 10 times.
- Since the number of iterations is fixed and does not depend on
  the input value, the running time is constant.

Space Complexity:
O(1)

Why?
- The program uses only two integer variables:
  - num
  - i
- No additional data structures such as arrays, lists,
  or recursion are used.
- Therefore, the memory usage remains constant.

*/