// Problem: Find the Maximum Frequency of an Element in an Array

// My Solution

public class MaximumFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 1, 2, 4, 3};

        int[] freq = new int[100];

        // Count the frequency of each element
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int max = 0;

        // Find the maximum frequency
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        System.out.println("Maximum Frequency: " + max);
    }
}

/*
Problem:
Find the maximum frequency (highest number of occurrences)
of any element in the given array.

Approach:

- Create a frequency array of size 100.
- Traverse the given array and increase the frequency
  of each element.
- Traverse the frequency array.
- Keep updating the maximum frequency whenever a
  larger frequency is found.
- Print the maximum frequency.

Key Logic:

freq[arr[i]]++;

This stores the frequency of every element.

Example:

If arr[i] = 5,

freq[5]++;

means the frequency of element 5 increases by 1.

-------------------------------------------------------

Example 1

Input:
{1, 2, 1, 1, 1, 2, 4, 3}

Frequency Table:

Element   Frequency
1             4
2             2
3             1
4             1

Output:
Maximum Frequency: 4

-------------------------------------------------------

Example 2

Input:
{5, 5, 5, 2, 2, 8}

Frequency Table:

Element   Frequency
2             2
5             3
8             1

Output:
Maximum Frequency: 3

-------------------------------------------------------

Time Complexity:
O(n)

Why?

- The first loop traverses all elements in the array.
      O(n)

- The second loop traverses the frequency array
  of size 100.
      O(100)

Total:

O(n + 100)

Since 100 is a constant,

Time Complexity = O(n)

-------------------------------------------------------

Space Complexity:
O(1)

Why?

- A frequency array of fixed size (100) is used.
- The size of the frequency array does not depend
  on the input size.
- Only one additional integer variable (max) is used.

Therefore,

Space Complexity = O(1)

-------------------------------------------------------

Advantages:

✔ Simple and easy to understand.
✔ Efficient for arrays containing small positive integers.
✔ Finds the highest frequency in a single traversal
  of the frequency array.

-------------------------------------------------------

Disadvantages:

✘ Works only when the array elements are within
  the range of the frequency array (0–99).
✘ Wastes memory if the array contains only a few
  elements but the frequency array is large.
✘ Cannot handle negative numbers without modification.

-------------------------------------------------------

When to Use:

- When the range of input values is small and known.
- Suitable for beginner-level frequency counting problems.

-------------------------------------------------------
*/