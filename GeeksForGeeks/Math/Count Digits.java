//Problem: Count digits

//My Solution

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int original = n;
        
        while(original > 0){
            int digit = original % 10; //get last digit
            
            if(digit != 0 && n % digit == 0){
                count++;
            }
            original = original / 10; //remove last digit
        }
        return count;
    }
}

/*Approach

This solution counts how many digits of a number evenly divide the number itself.
To avoid modifying the original number, a copy is used to extract digits one by one.

Key Logic

- Extract each digit using modulo (% 10).
- Ignore digit 0 to avoid division by zero.
- Check if the original number is divisible by the digit.
- Increase the count if it divides evenly.
- Remove the last digit using integer division (/ 10).

Example

Input:
n = 12

Digits: 1, 2
12 % 1 = 0 → count++
12 % 2 = 0 → count++

Output:
2

Time Complexity:
O(d) where d is the number of digits in n

Space Complexity:
O(1)

*/
