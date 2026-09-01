package LeetCode;

// LeetCode Problem 202: Happy Number

import java.util.HashSet;

public class HappyNumber {

    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while(n != 1){

            int sum = 0;

            if(seen.contains(n)){
                return false;
            }
            else{
                seen.add(n);
            }

            while(n > 0){

                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 19;

        HappyNumber obj = new HappyNumber();

        System.out.println(obj.isHappy(n));
    }
}

// Approach: Use a HashSet to store previously seen numbers and detect cycles.
// Keep replacing n with the sum of squared digits until it becomes 1 or a repeated number is found.