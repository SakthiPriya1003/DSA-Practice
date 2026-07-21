// Problem: Find the Element with Maximum Frequency in an Array

// Solution

public class MaximumFrequencyElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 1, 2, 4, 3};

        int[] freq = new int[100];

        // Count the frequency of each element
        for (int i = 0; i < arr.length; i++) {

            freq[arr[i]]++;

        }

        int max = 0;
        int element = -1;

        // Find the element with maximum frequency
        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > max) {

                max = freq[i];
                element = i;

            }
        }

        System.out.println("Maximum Frequency: " + max);
        System.out.println("Element with Maximum Frequency: " + element);
    }
}

/*
Problem:
Find the element that appears the maximum number of times
in a given array and also print its frequency.

Approach:

- Create a frequency array of size 100.
- Traverse the given array and increase the frequency
  of each element.
- Traverse the frequency array.
- Keep track of:
    - the maximum frequency.
    - the element corresponding to that frequency.
- Print both the maximum frequency and the element.

Key Logic:

freq[arr[i]]++;

This stores the frequency of every element.

Whenever a larger frequency is found,

max = freq[i];
element = i;

Here,

max stores the highest frequency.

element stores the array element having
the highest frequency.

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
Element with Maximum Frequency: 1

-------------------------------------------------------

Example 2

Input:
{5, 5, 5, 7, 7, 8}

Frequency Table:

Element   Frequency
5             3
7             2
8             1

Output:
Maximum Frequency: 3
Element with Maximum Frequency: 5

-------------------------------------------------------

Time Complexity:
O(n)

Why?

- The first loop traverses all elements
  of the array.
      O(n)

- The second loop traverses the frequency
  array of size 100.
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
- Two additional integer variables
  (max and element) are used.
- Memory usage does not depend on the input size.

Therefore,

Space Complexity = O(1)

-------------------------------------------------------

Advantages:

✔ Easy to understand and implement.
✔ Finds both the maximum frequency and the
  corresponding element.
✔ Efficient for arrays with small positive integers.
✔ Faster than nested loop approaches (O(n²)).

-------------------------------------------------------

Disadvantages:

✘ Works only when array elements are within
  the range of the frequency array (0–99).
✘ Cannot handle negative numbers without modification.
✘ Not suitable when the range of values is very large,
  as it may waste memory.

-------------------------------------------------------

When to Use:

- When the array contains small positive integers.
- When both the element and its maximum frequency
  are required.
- Suitable for frequency-counting problems in
  coding interviews and DSA practice.

-------------------------------------------------------

Comparison with Other Methods:

- More informative than the Maximum Frequency program,
  which only prints the highest frequency.
- Faster than using nested loops (O(n²)).
- Simpler than using HashMap when the range of values
  is small and known.
- HashMap is preferred if the array contains large
  values or negative numbers.

*/