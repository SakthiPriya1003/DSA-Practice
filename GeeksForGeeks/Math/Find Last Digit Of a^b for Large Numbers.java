class Solution {
    static int getLastDigit(String a, String b) {
        
        if(a.length() == 1 && a.charAt(0) == '1'){
            return 1;
        }
        if (b.equals("0")){
            return 1;            
        }
        
        int num_a = a.charAt(a.length() - 1) - '0';
        int num_b = 0;
        
        for(int i = 0; i < b.length(); i++){
            num_b = num_b * 10 + (b.charAt(i) - '0');
            num_b %= 4;
        }
        
        if(num_b == 0){
            num_b = 4;
        }
        
        int res = (int) Math.pow(num_a, num_b);
        res = res%10;
        
        return res;
        
    }
};



/*
Approach

This solution finds the last digit of a^b without computing the full power, which is not feasible for very large numbers.
Both a (base) and b (exponent) are given as strings, so the solution relies on digit patterns rather than numerical computation.

---

Key Logic

* The last digit of powers of any number repeats in a cycle of length 4.
* Only the last digit of the base affects the final result.
* To determine which value in the cycle to use, we compute b % 4 using the string representation of 'b'.
* If the exponent is "0", the result is always 1.
* If b % 4 == 0, we treat it as 4 to correctly index the cycle.

---

Why modulo 4 works

The last digits repeat every 4 powers:

Example:

2^1 = 2
2^2 = 4
2^3 = 8
2^4 = 6
2^5 = 2  ← cycle repeats

So instead of computing a^b, we only need:

(last digit of a)^(b % 4)

---
Example

Input:

a = "3", b = "10"

Steps:

* Last digit of a = 3
* Compute b % 4 → 10 % 4 = 2
* Compute 3² = 9
* Last digit = 9

Output:9

---
Time Complexity

O(|b|) — computing b % 4 by traversing the string

Space Complexity

O(1) — constant extra space used
---
*/