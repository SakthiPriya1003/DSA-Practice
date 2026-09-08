package LeetCode;

// LeetCode Problem 2413: Smallest Even Multiple

public class SmallestEvenMultiple {

    public int smallestEvenMultiple(int n) {

        if (n % 2 == 0) {
            return n;
        }

        return n * 2;
    }

    public static void main(String[] args) {

        int n = 5;

        SmallestEvenMultiple obj = new SmallestEvenMultiple();

        int ans = obj.smallestEvenMultiple(n);

        System.out.println("Smallest Even Multiple: " + ans);
    }
}

// Approach: Check whether n is already even.

// If n is even, n itself is the smallest number divisible by both n and 2.

// If n is odd, multiplying n by 2 gives the smallest even multiple of n.
//Exammple : 5 is not divisible by 2. The smallest even multiple of 5 is: 5 × 2 = 10

// Time Complexity: O(1)

// Space Complexity: O(1)
