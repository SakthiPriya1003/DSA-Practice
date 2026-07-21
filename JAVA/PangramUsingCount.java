// Problem: Check Whether a String is a Pangram (Using Count)

// Solution

public class PangramUsingCount {

    public static void main(String[] args) {

        String str = "thequickbrownfoxjumpsoveralazdo";

        char[] arr = str.toCharArray();

        int[] freq = new int[26];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - 'a']++;
        }

        int count = 0;

        // Count missing alphabets
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }
    }
}

/*
Problem:
Check whether a given string is a Pangram
using a count variable.

Approach:
- Create a frequency array.
- Count how many alphabets are missing.
- If count is 0, it is a Pangram.
- Otherwise, it is not.

Key Logic:
- Missing alphabet count is stored in the variable "count".
- count == 0 means every alphabet exists.

Example 1

Input:
thequickbrownfoxjumpsoveralazydog

Output:
Pangram

Example 2

Input:
thequickbrownfoxjumpsoveralazdo

Output:
Not a Pangram

Time Complexity:
O(n)

Why?
- Traverse the string once.
- Traverse 26 alphabets once.
- O(n + 26) = O(n)

Space Complexity:
O(1)

Why?
- Uses a fixed-size frequency array.
- Uses one integer variable.

Advantages:
- Easy to understand.
- Can also determine how many letters are missing.

Disadvantages:
- Always checks all 26 alphabets.
- Slightly more work than the Boolean approach.

When to Use:
- When the number of missing letters is important.

Comparison with Other Methods:
- Better than Print Method when only checking Pangram.
- Less efficient than Boolean because it cannot stop early.
*/
