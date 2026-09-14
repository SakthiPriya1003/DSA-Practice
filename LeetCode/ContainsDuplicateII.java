package LeetCode;

import java.util.HashMap;

// LeetCode Problem 219: Contains Duplicate II

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // If we have seen this number before
            if (map.containsKey(nums[i])) {

                int previousIndex = map.get(nums[i]);

                // Check if the two indices are within k distance
                if (i - previousIndex <= k) {
                    return true;
                }
            }

            // Store the latest index of the number
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicateII obj = new ContainsDuplicateII();

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println(obj.containsNearbyDuplicate(nums, k));
    }

    /*
     * Pattern: HashMap
     *
     * Approach:
     * Store each number with its latest index.
     * If the number appears again, check the index difference.
     * If the difference is <= k, return true.
     *
     * Why HashMap?
     * We need to remember where each number was seen.
     *
     * Time: O(N)
     * Space: O(N)
     */
}
