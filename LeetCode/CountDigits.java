package LeetCode;

// LeetCode Problem 2520: Count the Digits That Divide a Number

public class CountDigits {

    public int countDigits(int num) {

        int original = num;

        int count = 0;

        while (num != 0) {

            int digit = num % 10;

            if (original % digit == 0) {
                count++;
            }

            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        int num = 1248;

        CountDigits obj = new CountDigits();

        int ans = obj.countDigits(num);

        System.out.println("Count of Digits: " + ans);
    }
}

// Approach: Extract each digit of the number using % 10.

// Check whether the original number is divisible by the extracted digit.

// If it is divisible, increase the count.

// Use / 10 to remove the last digit and continue until all digits are processed.

// Time Complexity: O(log n)

// Space Complexity: O(1)