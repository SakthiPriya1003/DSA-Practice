package LeetCode;

// LeetCode Problem 258: Add Digits

public class AddDigits {

    public int addDigits(int num) {

        int digit = 0;

        while(num >= 10){

            int sum = 0;

            while(num > 0){

                digit = num % 10;
                sum += digit; 
                num = num / 10; 
            }

            num = sum; // Repeat with the new sum
        }

        return num; // Return the single digit
    }

    public static void main(String[] args) {

        int num = 38;

        AddDigits obj = new AddDigits();

        System.out.println(obj.addDigits(num));
    }
}

// Approach: Repeatedly extract and add digits until a single digit remains.
// Time Complexity: O(log n)
// Space Complexity: O(1)