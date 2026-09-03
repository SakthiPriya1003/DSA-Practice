package LeetCode;

// LeetCode Problem 1929: Concatenation of Array

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        // Concatenate the array using modulo
        for(int i = 0; i < ans.length; i++){

            ans[i] = nums[i % n];

        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        ConcatenationOfArray obj = new ConcatenationOfArray();

        int[] ans = obj.getConcatenation(nums);

        System.out.print("Concatenated Array: ");

        for(int num : ans){

            System.out.print(num + " ");

        }

    }

}

// Approach: Create an array of size 2 * N and use i % N to repeat the original array.

// Time Complexity: O(N)

// Space Complexity: O(N)
