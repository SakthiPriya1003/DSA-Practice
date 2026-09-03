package LeetCode;

// LeetCode Problem 169: Majority Element

public class MajorityElementOptimal {

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        // Find the majority element using Boyer-Moore Voting Algorithm
        for(int num : nums){

            if(count == 0){

                candidate = num;

            }

            if(num == candidate){

                count++;

            } else {

                count--;

            }

        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        MajorityElementOptimal obj = new MajorityElementOptimal();

        int ans = obj.majorityElement(nums);

        System.out.println("Majority Element: " + ans);

    }

}

// Approach: Use Boyer-Moore Voting Algorithm to find the majority element.

// Same elements increase the count and different elements decrease it.

// Since the majority element occurs more than n/2 times, it remains as the candidate.

// Time Complexity: O(n)

// Space Complexity: O(1)
