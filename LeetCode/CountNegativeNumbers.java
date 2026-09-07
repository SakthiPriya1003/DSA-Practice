package LeetCode;

// Problem: Count Negative Numbers in a Sorted Matrix
//Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid

public class CountNegativeNumbers {

    static int countNegatives(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int row = 0;
        int col = n - 1;
        int count = 0;

        while (row < m && col >= 0) {

            if (grid[row][col] < 0) {

                // All elements below are also negative
                count += m - row;

                col--;

            } else {

                row++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        int result = countNegatives(grid);

        System.out.println("Number of negative numbers: " + result);
    }
}

/*
Approach - Optimized Matrix Traversal

This solution counts the negative numbers in a matrix
where each row and column is sorted in non-increasing order.

Instead of checking every element, we start from the
top-right corner and use the sorted property of the matrix.

Key Logic

- Start from the top-right corner of the matrix.
- If the current element is negative:
    - All elements below it in the same column are also negative.
    - Count them using (m - row).
    - Move left to check the remaining columns.
- If the current element is non-negative:
    - Move down to find negative elements in the next rows.
- Continue until the row or column goes out of bounds.

Why count using (m - row)?

Suppose:

grid[2][2] = -1

Column 2:

row 0 → 2
row 1 → 1
row 2 → -1
row 3 → -2

Since the column is sorted in non-increasing order,
all elements below -1 are also negative.

Total rows = 4
Current row = 2

Number of negative elements = 4 - 2 = 2

So:

count += m - row;

Example

Input:

grid = {
    {4, 3, 2, -1},
    {3, 2, 1, -1},
    {1, 1, -1, -2},
    {-1, -1, -2, -3}
}

Dry Run:

Start from top-right:

row = 0, col = 3

grid[0][3] = -1
Negative → count = 4 - 0 = 4
Move left

grid[0][2] = 2
Positive → move down

grid[1][2] = 1
Positive → move down

grid[2][2] = -1
Negative → count = 4 - 2 = 2
Total count = 6
Move left

grid[2][1] = 1
Positive → move down

grid[3][1] = -1
Negative → count = 4 - 3 = 1
Total count = 7
Move left

grid[3][0] = -1
Negative → count = 4 - 3 = 1
Total count = 8

Output:

8

Time Complexity:
O(m + n)

Why?
- We start from the top-right corner.
- The row pointer only moves downward.
- The column pointer only moves left.
- Therefore, at most m + n movements are performed.

Space Complexity:
O(1)

Why?
- Only a few variables (row, col, count, m, n) are used.
- No extra data structures or recursion are required.
- Hence, the memory usage remains constant.

*/
