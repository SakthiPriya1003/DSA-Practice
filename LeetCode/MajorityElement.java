package LeetCode;

// LeetCode Problem 169: Majority Element

import java.util.*;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for(int num : nums){

            map.put(num, map.getOrDefault(num, 0) + 1);

        }

        // Find the majority element
        for(int num : map.keySet()){

            if(map.get(num) > n / 2){

                return num;

            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        MajorityElement obj = new MajorityElement();

        int ans = obj.majorityElement(nums);

        System.out.println("Majority Element: " + ans);

    }

}

// Approach: Store each element and its frequency using a HashMap.

// Find the element whose frequency is greater than n/2.

// Time Complexity: O(n)

// Space Complexity: O(n)


