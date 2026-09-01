package LeetCode;

// LeetCode Problem 1470: Shuffle the Array

import java.util.Arrays;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] ans = new int[nums.length];

        for(int i = 0; i < n; i++){

            ans[2 * i] = nums[i];       // Add xi
            ans[2 * i + 1] = nums[n + i]; // Add yi
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;

        ShuffleTheArray obj = new ShuffleTheArray();

        System.out.println(Arrays.toString(obj.shuffle(nums, n)));
    }
}

// Approach: Use a new array and place xi at even indices and yi at odd indices.
// Time Complexity: O(n)
// Space Complexity: O(n)
