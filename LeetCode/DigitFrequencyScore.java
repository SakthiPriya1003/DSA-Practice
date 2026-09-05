package LeetCode;

// LeetCode Problem 3945: Digit Frequency Score

public class DigitFrequencyScore {

    public int digitFrequencyScore(int n) {

        int[] freq = new int[10];

        // Count the frequency of each digit
        while(n != 0){

            int digit = n % 10;

            freq[digit]++;

            n = n / 10;
        }

        int score = 0;

        // Calculate digit * frequency for each digit
        for(int digit = 0; digit <= 9; digit++){

            score += digit * freq[digit];
        }

        return score;
    }

    public static void main(String[] args) {

        int n = 122;

        DigitFrequencyScore obj = new DigitFrequencyScore();

        int result = obj.digitFrequencyScore(n);

        System.out.println("Digit Frequency Score: " + result);
    }
}

// Approach: Store the frequency of each digit using an integer array of size 10,
// then calculate the score using digit * frequency.

// Time Complexity: O(N), where N is the number of digits.

// Space Complexity: O(1)
