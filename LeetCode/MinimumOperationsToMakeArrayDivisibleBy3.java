package LeetCode;

// LeetCode Problem: Minimum Operations to Make Array Divisible by 3

public class MinimumOperationsToMakeArrayDivisibleBy3 {

    public int minimumOperations(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // If the number is not divisible by 3,
            // we need exactly one operation (+1 or -1).
            if (nums[i] % 3 != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        MinimumOperationsToMakeArrayDivisibleBy3 obj =
                new MinimumOperationsToMakeArrayDivisibleBy3();

        int[] nums = {1, 2, 3, 4};

        System.out.println(obj.minimumOperations(nums));
    }

    /*
     * Approach:
     *
     * For every element, check its remainder when divided by 3.
     *
     * If nums[i] % 3 == 0:
     *     The number is already divisible by 3.
     *     Operations needed = 0.
     *
     * If nums[i] % 3 != 0:
     *     The number can always be made divisible by 3
     *     using exactly one operation (+1 or -1).
     *
     * Example:
     *
     * 1 % 3 = 1  -> 1 - 1 = 0  -> 1 operation
     * 2 % 3 = 2  -> 2 + 1 = 3  -> 1 operation
     * 3 % 3 = 0  -> already divisible -> 0 operations
     * 4 % 3 = 1  -> 4 - 1 = 3  -> 1 operation
     *
     * nums = [1, 2, 3, 4]
     *
     * Total operations = 1 + 1 + 0 + 1
     *                   = 3
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
}
