// Problem: Check Whether a String is a Pangram (Print Missing Letters)

// Solution

public class PangramUsingPrintMissingLetters {

    public static void main(String[] args) {

        String str = "thequickbrownfoxjumpsoveralazdo";

        char[] arr = str.toCharArray();

        int[] freq = new int[26];

        // Store the frequency of each alphabet
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - 'a']++;
        }

        System.out.println("Missing Letters:");

        // Print the missing letters
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                System.out.println((char)(i + 'a'));
            }
        }
    }
}

/*
Problem:
Check whether a given string is a Pangram.
If it is not a Pangram, print all the missing alphabets.

Approach:
- Create a frequency array of size 26.
- Traverse the string and increase the frequency of
  each character.
- Traverse the frequency array.
- If any frequency is 0, print that alphabet.

Key Logic:
freq[arr[i] - 'a']++;

This converts:
'a' -> index 0
'b' -> index 1
...
'z' -> index 25

Example 1

Input:
thequickbrownfoxjumpsoveralazydog

Output:
No output (No letters are missing)

Example 2

Input:
thequickbrownfoxjumpsoveralazdo

Output:
Missing Letters:
g
y

Time Complexity:
O(n)

Why?
- First loop traverses the string.
- Second loop checks only 26 alphabets.
- Therefore,
  O(n + 26) = O(n)

Space Complexity:
O(1)

Why?
- Frequency array size is always 26.
- Memory does not depend on input size.

Advantages:
- Prints exactly which letters are missing.
- Helpful for debugging and learning.

Disadvantages:
- Does not directly determine whether the string is a Pangram.
- Always checks all 26 alphabets.

When to Use:
- When the missing letters are required.

Comparison with Other Methods:
- Gives more information than the Count and Boolean methods.
- Slightly less efficient because it always checks all alphabets.
*/