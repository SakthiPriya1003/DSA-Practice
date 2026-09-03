package LeetCode;

// LeetCode Problem 1572: Matrix Diagonal Sum

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        // Add elements from both diagonals
        for(int i = 0; i < n; i++){

            sum += mat[i][i];
            sum += mat[i][n - 1 - i];

        }

        // Subtract the center element if matrix size is odd
        if(n % 2 == 1){

            sum -= mat[n / 2][n / 2];

        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        MatrixDiagonalSum obj = new MatrixDiagonalSum();

        int ans = obj.diagonalSum(mat);

        System.out.println("Diagonal Sum: " + ans);

    }

}

// Approach: Traverse the matrix once and add elements from the primary and secondary diagonals.

// If the matrix size is odd, subtract the center element once because it is counted twice.

// Time Complexity: O(n)

// Space Complexity: O(1)
