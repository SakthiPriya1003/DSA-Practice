import java.util.Scanner;

class ArmstrongNumber {

    static boolean isArmstrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;                 // Extract the last digit
            sum += digit * digit * digit;       // Add the cube of the digit
            n = n / 10;                         // Remove the last digit
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is Not an Armstrong Number.");
        }

        sc.close();
    }
}

/*
Problem: Armstrong Number

Approach

This program checks whether a given 3-digit number is an
Armstrong number.

An Armstrong number is a number whose sum of the cubes of
its digits is equal to the original number.

Example:
153

1³ + 5³ + 3³

= 1 + 125 + 27

= 153

Hence, 153 is an Armstrong number.

Key Logic

- Store the original number.
- Initialize sum as 0.
- Extract the last digit using (% 10).
- Find the cube of the digit.
- Add the cube to sum.
- Remove the last digit using (/ 10).
- Repeat until the number becomes 0.
- Compare sum with the original number.

Example 1

Input:
153

Execution:

Digit = 3
Cube = 27
Sum = 27

Digit = 5
Cube = 125
Sum = 152

Digit = 1
Cube = 1
Sum = 153

Output:
153 is an Armstrong Number.

----------------------------------------

Example 2

Input:
372

Execution:

Digit = 2
Cube = 8
Sum = 8

Digit = 7
Cube = 343
Sum = 351

Digit = 3
Cube = 27
Sum = 378

Output:
372 is Not an Armstrong Number.

----------------------------------------

Example 3

Input:
100

Execution:

Digit = 0
Cube = 0
Sum = 0

Digit = 0
Cube = 0
Sum = 0

Digit = 1
Cube = 1
Sum = 1

Output:
100 is Not an Armstrong Number.

Time Complexity:
O(1)

Why?
- The input is always a 3-digit number.
- The loop executes exactly 3 times.
- Each iteration performs constant-time operations.
- Therefore, the running time is constant.

Space Complexity:
O(1)

Why?
- The program uses only a few variables:
    - original
    - sum
    - digit
- No extra arrays, lists, or recursion are used.
- Hence, the extra memory usage remains constant.

Key Takeaways

✔ Store the original number before modifying it.
✔ Extract digits using (% 10).
✔ Remove digits using (/ 10).
✔ Add the cube of every digit.
✔ Compare the final sum with the original number.

*/
