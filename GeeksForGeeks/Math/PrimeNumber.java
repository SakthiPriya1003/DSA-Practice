// Problem: Given a number n, determine whether it is a prime number or not.

// Solution
import java.util.Scanner;

class PrimeNumber {

    static boolean isPrime(int n) {

        // A prime number must be greater than 1
        if (n <= 1) {
            return false;
        }

        // Check divisibility only up to √n
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is Not a Prime Number.");
        }

        sc.close();
    }
}
/*
Problem: Prime Number

Approach

A prime number is a number greater than 1 that has exactly
two positive divisors: 1 and itself.

Instead of checking every number from 2 to n-1, we only
check divisors up to the square root of n (√n).

Reason:
- Factors always occur in pairs.
- If a number has a factor greater than √n,
  the corresponding paired factor will be smaller than √n.
- Therefore, checking beyond √n is unnecessary.

Key Logic

- If n <= 1, return false.
- Iterate from 2 while (i * i <= n).
- If n is divisible by any i, return false.
- If no divisor is found, return true.

Example 1

Input:
7

Execution:

7 > 1

7 % 2 != 0
7 % 3 != 0

Loop ends

Output:
true

Explanation:
7 has exactly two divisors: 1 and 7.

----------------------------------------

Example 2

Input:
25

Execution:

25 > 1

25 % 2 != 0
25 % 3 != 0
25 % 4 != 0
25 % 5 == 0

Output:
false

Explanation:
25 is divisible by 5, so it is not a prime number.

----------------------------------------

Example 3

Input:
1

Execution:

1 <= 1

Output:
false

Explanation:
1 is not considered a prime number.

Time Complexity:
O(√n)

Why?
- The loop runs only up to √n.
- Each iteration performs a constant-time modulo operation.
- Therefore, the total running time is proportional to √n.

Space Complexity:
O(1)

Why?
- The algorithm uses only a few variables:
    - n (input)
    - i (loop variable)
- No extra arrays, lists, or recursion are used.
- Hence, the extra memory usage remains constant.

Key Takeaways

✔ A prime number is greater than 1.
✔ Check divisibility only up to √n.
✔ Use (i * i <= n) instead of Math.sqrt(n).
✔ Always handle the edge case (n <= 1).

*/