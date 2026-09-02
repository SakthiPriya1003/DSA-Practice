package LeetCode;

// LeetCode Problem 349: Intersection of Two Arrays

import java.util.*;

public class IntersectionOfArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // Store elements of nums1
        for(int num : nums1){
            set1.add(num);
        }

        // Find common elements
        for(int num : nums2){

            if(set1.contains(num)){
                result.add(num);
            }
        }

        // Create an array with the size of unique common elements
        int[] ans = new int[result.size()];

        int i = 0;

        // Convert HashSet into array
        for(int num : result){
            ans[i] = num;
            i++;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        IntersectionOfArrays obj = new IntersectionOfArrays();

        int[] ans = obj.intersection(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(ans));
    }
}

// Approach: Store nums1 elements in a HashSet and check nums2 for common elements.
// Use another HashSet to avoid duplicate values, then convert it into an array.
// Time Complexity: O(n + m)
// Space Complexity: O(n + m)