package LeetCode;

// LeetCode Problem 1486: XOR Operation in an Array

public class XOROperationInAnArray {

    public int xorOperation(int n, int start) {

        int xor = 0;

        // Generate each value and calculate XOR
        for(int i = 0; i < n; i++){

            int value = start + 2 * i;

            xor ^= value;

        }

        return xor;
    }

    public static void main(String[] args) {

        int n = 5;
        int start = 0;

        XOROperationInAnArray obj = new XOROperationInAnArray();

        int result = obj.xorOperation(n, start);

        System.out.println("XOR Result: " + result);

    }
}

// Approach: Generate each value using start + 2 * i and calculate the XOR of all values.

// Time Complexity: O(N)

// Space Complexity: O(1)
