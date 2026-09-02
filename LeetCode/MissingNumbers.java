package LeetCode;

// LeetCode Problem 268: Missing Number

import java.util.*;

public class MissingNumbers {

    public void missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for(int num : nums){
            actualSum += num;
        }

        System.out.println("Missing number: " + (expectedSum - actualSum));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        MissingNumbers obj = new MissingNumbers();

        obj.missingNumber(arr);

        sc.close();
    }
}


// Approach: Find the expected sum from 0 to n and subtract the actual array sum.
// The difference gives the missing number.
// Time Complexity: O(n)
// Space Complexity: O(1)
