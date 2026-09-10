package LeetCode;

// LeetCode Problem 1837: Sum of Digits in Base K

/*
 * =========================
 * Explain the Program
 * =========================
 *
 * Given an integer n and a base k, we need to:
 *
 * 1. Convert n from base 10 to base k.
 * 2. Add all the digits of the converted number.
 * 3. Return the sum.
 *
 * Example:
 *
 * n = 34, k = 6
 *
 * 34 in base 6 = 54
 *
 * Sum of digits:
 * 5 + 4 = 9
 */

public class SumBase {

    public int sumBase(int n, int k) {

        int sum = 0;

        while (n != 0) {

            int digit = n % k;

            sum += digit;

            n = n / k;
        }

        return sum;
    }

    public static void main(String[] args) {

        SumBase obj = new SumBase();

        System.out.println(obj.sumBase(34, 6));  // Output: 9
        System.out.println(obj.sumBase(10, 10)); // Output: 1
    }
}


 /*
 * n % k gives the last digit when converting n to base k.
 * n / k removes that digit.
 *
 * We repeat this until n becomes 0.
 *
 *
 * =========================
 * Solution / Approach
 * =========================
 *
 * Step 1: Initialize sum = 0.
 *
 * Step 2: Use n % k to get the current digit.
 *
 * Step 3: Add the digit to sum.
 *
 * Step 4: Use n / k to move to the next digit.
 *
 * Step 5: Repeat until n becomes 0.
 *
 * Step 6: Return sum.
 *
 *
 * Dry Run:
 *
 * n = 34, k = 6
 *
 * 34 % 6 = 4
 * sum = 4
 * n = 34 / 6 = 5
 *
 * 5 % 6 = 5
 * sum = 4 + 5 = 9
 * n = 5 / 6 = 0
 *
 * Return 9
 *
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 */