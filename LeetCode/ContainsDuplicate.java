package LeetCode;

// LeetCode Problem 217: Contains Duplicate

import java.util.*;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){

            // Check if the number is already present
            if(set.contains(nums[i])){
                return true;
            }

            // Add the number to the set
            set.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        ContainsDuplicate obj = new ContainsDuplicate();

        System.out.println("Contains Duplicate: " + obj.containsDuplicate(arr));

        sc.close();
    }
}

// Approach: Use a HashSet to store elements and check whether an element is already present.
// If an element is found again, return true; otherwise return false after checking all elements.
// Time Complexity: O(n)
// Space Complexity: O(n)
