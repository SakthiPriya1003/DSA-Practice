// Problem: Floor Square Root

// My Solution

import java.util.Scanner;

public class FloorSqrt {

    static int floorSqrt(int n) {

        int low = 1;
        int high = n;
        int answer = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            }

            if (square < n) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int result = floorSqrt(n);

        System.out.println("Floor square root of " + n + " is: " + result);

        sc.close();
    }
}

/*
Approach - Binary Search

This solution finds the floor square root of a positive integer
using Binary Search.

Instead of checking every possible number, Binary Search
eliminates half of the search space in every iteration,
making it much faster for large inputs.

Key Logic

- Initialize the search range from 1 to n.
- Find the middle element.
- Compute mid × mid.
- If mid² equals n, return mid.
- If mid² is less than n:
    - Store mid as the current answer.
    - Search in the right half.
- Otherwise:
    - Search in the left half.
- Return the stored answer after the loop ends.

Example

Input:
n = 11

Dry Run:

low = 1, high = 11

mid = 6
6² = 36 > 11
Search Left

low = 1, high = 5

mid = 3
3² = 9 < 11
answer = 3
Search Right

low = 4, high = 5

mid = 4
4² = 16 > 11
Search Left

Loop Ends

Output:
3

Time Complexity:
O(log n)

Why?
- Binary Search divides the search space into two halves
  during each iteration.
- Therefore, the number of iterations grows logarithmically
  with the input size.

Space Complexity:
O(1)

Why?
- Only a few variables (low, high, mid, square, answer)
  are used.
- No extra data structures or recursion are required.
- Hence, the memory usage remains constant.

*/