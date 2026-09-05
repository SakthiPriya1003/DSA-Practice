package LeetCode;

// LeetCode Problem 2769: Find the Maximum Achievable Number

/*
Problem:
Given two integers num and t, find the maximum possible value of x.

A number x is achievable if it can become equal to num after applying
the following operation at most t times:

- Decrease x by 1 and simultaneously increase num by 1.
OR
- Increase x by 1 and simultaneously decrease num by 1.

Each operation changes the difference between x and num by 2.

To maximize x, we start with x greater than num and perform the operation
by decreasing x and increasing num simultaneously.

Therefore, each operation allows x to be 2 greater than num while still
being achievable.

Maximum achievable x = num + 2 * t.

Example:
Input: num = 4, t = 1

x = 6

Operation:
x   : 6 → 5
num : 4 → 5

Now x and num are equal.

Output: 6

Example:
Input: num = 3, t = 2

Maximum achievable x = 3 + (2 * 2) = 7

Operations:
x   : 7 → 6 → 5
num : 3 → 4 → 5

Now x and num are equal.

Output: 7
*/

public class MaximumAchievableNumber {

    public int theMaximumAchievableX(int num, int t) {

        return num + 2 * t;
    }

    public static void main(String[] args) {

        int num = 4;
        int t = 1;

        MaximumAchievableNumber obj = new MaximumAchievableNumber();

        int result = obj.theMaximumAchievableX(num, t);

        System.out.println("Maximum Achievable X: " + result);
    }
}

// Approach: Each operation can increase the maximum achievable value of x
// by 2 relative to num. Therefore, the answer is num + 2 * t.
//
// Time Complexity: O(1)
//
// Space Complexity: O(1)