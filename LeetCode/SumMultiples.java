package LeetCode;

// LeetCode Problem 2652: Sum Multiples

public class SumMultiples {

    public static int sumOfMultiples(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int n = 10;

        int ans = sumOfMultiples(n);

        System.out.println("Sum of Multiples: " + ans);
    }
}

// Approach: Traverse from 1 to n and check whether each number
// is divisible by 3, 5, or 7.

// If the number is divisible by at least one of them, add it to the sum.

// Time Complexity: O(n)

// Space Complexity: O(1)
