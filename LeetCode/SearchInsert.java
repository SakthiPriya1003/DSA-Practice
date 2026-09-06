package LeetCode;

// LeetCode Problem 35: Search Insert Position

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                return mid;
            }
            else if (target > nums[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        SearchInsert obj = new SearchInsert();

        int ans = obj.searchInsert(nums, target);

        System.out.println("Search Insert Position: " + ans);
    }
}

// Approach: Use Binary Search to find the target or its correct insertion position.
//
// If target is equal to nums[mid], return mid.
//
// If target is greater than nums[mid], search in the right half.
//
// If target is smaller than nums[mid], search in the left half.
//
// If the target is not found, left represents the correct insertion position.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)