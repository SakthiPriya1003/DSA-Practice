package LeetCode;

// LeetCode Problem 744: Find Smallest Letter Greater Than Target

public class NextGreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (letters[left] > target) {
            return letters[left];
        }

        return letters[0];
    }

    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        NextGreatestLetter obj = new NextGreatestLetter();

        char ans = obj.nextGreatestLetter(letters, target);

        System.out.println("Next Greatest Letter: " + ans);
    }
}

// Approach: Use Binary Search to find the first letter strictly greater than target.
//
// If letters[mid] <= target, move left to mid + 1 because mid cannot be the answer.
//
// If letters[mid] > target, keep mid as a possible answer and move right to mid.
//
// If no letter is greater than target, return the first letter as the array wraps around.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)
