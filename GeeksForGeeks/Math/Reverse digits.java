//Problem: Reverse digits
class Solution {
    public int reverseDigits(int n) {
        int digit = 0; 
        int rev = 0;

        while (n > 0) {
            digit = n % 10;        // extract last digit
            rev = rev * 10 + digit; // build reversed number
            n = n / 10;            // remove last digit
        }
        return rev;
    }
}

/*Approach

This solution reverses the digits of a given number using basic arithmetic operations.
The number is processed digit by digit without using any extra data structures.

Key Logic

- Extract the last digit using modulo (% 10).
- Append the digit to the reversed number by multiplying the current result by 10.
- Remove the last digit using integer division (/ 10).
- Repeat until the number becomes 0.

Example

Input:
n = 1234

Steps:
4 → rev = 4
3 → rev = 43
2 → rev = 432
1 → rev = 4321

Output:
4321

Time Complexity:
O(d), where d is the number of digits in n

Space Complexity:
O(1)
*/
