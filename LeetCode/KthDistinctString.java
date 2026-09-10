package LeetCode;

import java.util.HashMap;

// LeetCode Problem 2053: Kth Distinct String in an Array

public class KthDistinctString {

    public String kthDistinct(String[] arr, int k) {

        HashMap<String, Integer> map = new HashMap<>();

        // Count the frequency of each string
        for (String i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Find the kth string that occurs exactly once
        for (String i : arr) {

            if (map.get(i) == 1) {
                k--;
            }

            if (k == 0) {
                return i;
            }
        }

        return "";
    }

    public static void main(String[] args) {

        String[] arr = {"d", "b", "c", "b", "c", "a"};

        int k = 2;

        KthDistinctString obj = new KthDistinctString();

        String ans = obj.kthDistinct(arr, k);

        System.out.println("Kth Distinct String: " + ans);
    }
}

// Approach: Use a HashMap to count the frequency of each string.

// Traverse the original array again to maintain the original order.

// If a string occurs exactly once, decrease k by 1.

// When k becomes 0, the current string is the kth distinct string.

// If there are fewer than k distinct strings, return an empty string.

// Time Complexity: O(n)

// Space Complexity: O(n)
