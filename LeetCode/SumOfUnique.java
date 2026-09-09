package LeetCode;

// LeetCode Problem 1748: Sum of Unique Elements

public class SumOfUnique {

    public int sumOfUnique(int[] nums) {

        int[] freq = new int[101];

        int sum = 0;

        // Count the frequency of each number
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        // Add numbers that appear exactly once
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2};

        SumOfUnique obj = new SumOfUnique();

        int ans = obj.sumOfUnique(nums);

        System.out.println("Sum of Unique Elements: " + ans);
    }
}

// Approach: Use a frequency array to count how many times each number appears.

// Since nums[i] is between 1 and 100, a frequency array of size 101
// can be used to store the count of each number.

// After counting the frequencies, traverse the frequency array.
// If a number appears exactly once, add that number to the sum.

// Time Complexity: O(n + k), where k is the range of possible values.

// Space Complexity: O(k), where k is the range of possible values.
