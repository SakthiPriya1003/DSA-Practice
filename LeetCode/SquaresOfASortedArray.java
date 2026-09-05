package LeetCode;

// LeetCode Problem 977: Squares of a Sorted Array

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        // Fill the result array from right to left
        for(int i = n - 1; i >= 0; i--){

            // Compare absolute values from both ends
            if(Math.abs(nums[left]) > Math.abs(nums[right])){

                result[i] = nums[left] * nums[left];
                left++;

            } else {

                result[i] = nums[right] * nums[right];
                right--;

            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        SquaresOfASortedArray obj = new SquaresOfASortedArray();

        int[] result = obj.sortedSquares(nums);

        System.out.print("Sorted Squares: ");

        for(int num : result){

            System.out.print(num + " ");

        }
    }
}

// Approach: Use two pointers at both ends and compare absolute values.

// Place the larger square at the end of the result array and move the corresponding pointer.

// Time Complexity: O(N)

// Space Complexity: O(N)
