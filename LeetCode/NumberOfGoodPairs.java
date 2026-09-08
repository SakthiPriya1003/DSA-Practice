package LeetCode;

import java.util.HashMap;

// LeetCode Problem 1512: Number of Good Pairs

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int num : nums) {

            count += map.getOrDefault(num, 0);

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 3};

        NumberOfGoodPairs obj = new NumberOfGoodPairs();

        int ans = obj.numIdenticalPairs(nums);

        System.out.println("Number of Good Pairs: " + ans);
    }
}

// Approach: Use a HashMap to store the frequency of each number.

// For every number, map.getOrDefault(num, 0) gives the number
// of times the same number has already appeared.

// Each previous occurrence forms one new good pair with the current number.

// Add the previous frequency to count, then increase the frequency
// of the current number in the HashMap.

// Time Complexity: O(n)

// Space Complexity: O(n)
