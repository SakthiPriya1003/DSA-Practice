// Problem: Check whether Two Strings are Anagrams

// My Solution

public class Anagram {

    public static void main(String[] args) {

        String s1 = "bcadef";
        String s2 = "fdecab";

        // Step 1: Check if both strings have the same length
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // Step 2: Create a frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Step 3: Increase the frequency of each character in the first string
        for (int i = 0; i < s1.length(); i++) {

            freq[s1.charAt(i) - 97]++;

        }

        // Step 4: Decrease the frequency using the second string
        for (int i = 0; i < s2.length(); i++) {

            freq[s2.charAt(i) - 97]--;

        }

        // Step 5: Check whether all frequencies are zero
        for (int i = 0; i < 26; i++) {

            if (freq[i] != 0) {

                System.out.println("Not Anagram");
                return;

            }
        }

        // Step 6: If all frequencies are zero, the strings are anagrams
        System.out.println("Anagram");
    }
}

/*
Problem:
Check whether two strings are anagrams.

Two strings are anagrams if:
- They contain the same characters.
- Each character appears the same number of times.
- The order of characters does not matter.

Approach:

- First, compare the lengths of both strings.
- If the lengths are different, they cannot be anagrams.
- Create a frequency array of size 26 for lowercase letters.
- Traverse the first string and increase the frequency of each character.
- Traverse the second string and decrease the frequency of each character.
- Traverse the frequency array.
- If every frequency is zero, the strings are anagrams.
- Otherwise, they are not anagrams.

Key Logic:

freq[s1.charAt(i) - 97]++;

This increases the frequency of every character
present in the first string.

freq[s2.charAt(i) - 97]--;

This decreases the frequency of every character
present in the second string.

If both strings contain the same characters with
the same frequency, every increment will be cancelled
by a corresponding decrement.

Therefore,

All values in the frequency array become zero.

-------------------------------------------------------

Example 1

Input:

s1 = "bcadef"
s2 = "fdecab"

Frequency after s1:

a = 1
b = 1
c = 1
d = 1
e = 1
f = 1

Frequency after s2:

a = 0
b = 0
c = 0
d = 0
e = 0
f = 0

Output:

Anagram

-------------------------------------------------------

Example 2

Input:

s1 = "listen"
s2 = "silent"

Output:

Anagram

-------------------------------------------------------

Example 3

Input:

s1 = "hello"
s2 = "world"

Output:

Not Anagram

-------------------------------------------------------

Time Complexity:
O(n)

Why?

- The first loop traverses the first string.
      O(n)

- The second loop traverses the second string.
      O(n)

- The third loop traverses the frequency array
  of size 26.
      O(26)

Total:

O(n + n + 26)

Since 26 is a constant,

Time Complexity = O(n)

-------------------------------------------------------

Space Complexity:
O(1)

Why?

- A frequency array of fixed size (26) is used.
- No extra space depends on the input size.

Therefore,

Space Complexity = O(1)

-------------------------------------------------------

Advantages:

✔ Efficient with linear time complexity.
✔ Easy to understand and implement.
✔ Does not require sorting.
✔ Uses constant extra space.
✔ Ideal for lowercase English letters.

-------------------------------------------------------

Disadvantages:

✘ Works only for lowercase English letters.
✘ Cannot handle uppercase letters directly.
✘ Cannot handle Unicode characters without modification.

-------------------------------------------------------

When to Use:

- When checking whether two lowercase strings
  are anagrams.
- When an O(n) solution is required.
- Suitable for coding interviews and DSA practice.

-------------------------------------------------------

Comparison with Other Methods:

- Faster than the sorting approach (O(n log n)).
- Uses constant extra space.
- Simpler than using a HashMap for lowercase letters.
- HashMap is preferred when strings contain
  Unicode characters, uppercase letters,
  or characters beyond 'a' to 'z'.

*/