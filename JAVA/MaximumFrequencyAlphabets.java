// Problem: Find the Alphabet with Maximum Frequency in a String

// Solution

public class MaximumFrequencyAlphabets {

    public static void main(String[] args) {

        String nums = "abaccc";

        char[] arr = nums.toCharArray();

        int[] freq = new int[26];

        // Count the frequency of each alphabet
        for (int i = 0; i < arr.length; i++) {

            freq[arr[i] - 97]++;

        }

        int max = 0;
        int elem = -1;

        // Find the alphabet with maximum frequency
        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > max) {

                max = freq[i];
                elem = i;

            }
        }

        char c = (char) (elem + 97);

        System.out.println("Alphabet with Maximum Frequency: " + c);
    }
}

/*
Problem:
Find the alphabet that appears the maximum number of times
in a given string.

Approach:

- Convert the string into a character array.
- Create a frequency array of size 26.
- Store the frequency of each alphabet.
- Traverse the frequency array to find the maximum frequency.
- Store the corresponding index.
- Convert the index back to its alphabet and print it.

Key Logic:

freq[arr[i] - 97]++;

ASCII Values:

'a' = 97
'b' = 98
'c' = 99
...
'z' = 122

Subtracting 97 converts:

'a' -> 0
'b' -> 1
'c' -> 2
...
'z' -> 25

After finding the maximum frequency,

(char)(elem + 97)

converts the array index back to its corresponding alphabet.

-------------------------------------------------------

Example 1

Input:
abaccc

Frequency Table:

Alphabet   Frequency
a              2
b              1
c              3

Output:
Alphabet with Maximum Frequency: c

-------------------------------------------------------

Example 2

Input:
aaaabbcc

Frequency Table:

Alphabet   Frequency
a              4
b              2
c              2

Output:
Alphabet with Maximum Frequency: a

-------------------------------------------------------

Time Complexity:
O(n)

Why?

- The first loop traverses all characters in the string.
      O(n)

- The second loop traverses the frequency array
  of size 26.
      O(26)

Total:

O(n + 26)

Since 26 is a constant,

Time Complexity = O(n)

-------------------------------------------------------

Space Complexity:
O(1)

Why?

- The frequency array always has a fixed size of 26.
- Two additional integer variables (max and elem)
  are used.
- The memory used does not depend on the input size.

Therefore,

Space Complexity = O(1)

-------------------------------------------------------

Advantages:

✔ Easy to understand and implement.
✔ Efficient for lowercase English alphabets.
✔ Finds the most frequent alphabet in linear time.

-------------------------------------------------------

Disadvantages:

✘ Works only for lowercase English alphabets.
✘ Cannot handle uppercase letters without modification.
✘ Cannot handle digits or special characters.

-------------------------------------------------------

When to Use:

- When the input contains only lowercase English letters.
- Suitable for character frequency counting problems.
- Commonly used in coding interviews and DSA practice.

-------------------------------------------------------

Comparison with Other Methods:

- Faster than using nested loops (O(n²)).
- Simpler than using HashMap for lowercase alphabets.
- Uses constant extra space because the frequency array
  size is fixed at 26.

*/