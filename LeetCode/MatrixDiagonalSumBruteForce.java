package LeetCode;

// LeetCode Problem 1572: Matrix Diagonal Sum

public class MatrixDiagonalSumBruteForce {

    public int diagonalSum(int[][] mat) {

        int sum = 0;

        for(int i = 0; i < mat.length; i++){

            for(int j = 0; j < mat.length; j++){

                if(j == i || j == mat.length - 1 - i){

                    sum += mat[i][j];

                }

            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        MatrixDiagonalSumBruteForce obj = new MatrixDiagonalSumBruteForce();

        int ans = obj.diagonalSum(mat);

        System.out.println("Diagonal Sum: " + ans);

    }

}

// Approach: Traverse every element of the matrix and check whether it belongs to the primary or secondary diagonal.

// Add the element if either diagonal condition is satisfied.

// Time Complexity: O(n²)

// Space Complexity: O(1)