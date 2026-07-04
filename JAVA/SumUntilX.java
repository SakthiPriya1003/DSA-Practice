// Problem: Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

// Solution

import java.util.*;
public class SumUntilX {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int sum = 0;

        while(true) {

            System.out.print("Enter a number (or 'x' to stop): ");

            String input = sc.next();

            if (input.equalsIgnoreCase("x")){
                break;
            }

            int num = Integer.parseInt(input);
            sum += num;
        }
        System.out.println("The sum of all entered numbers is: " + sum);

        sc.close();
            
        
    }

    
}

/*
Problem: Sum Until User Enters 'x'

Approach

This program continuously accepts numbers from the user
and calculates their sum. The input process stops when
the user enters 'x'.

Key Logic

- Initialize the sum as 0.
- Read the user input as a String.
- If the input is 'x' or 'X', terminate the loop.
- Otherwise, convert the input to an integer.
- Add the number to the running sum.
- Display the final sum after the loop ends.

Example

Input:
10
20
30
x

Output:
The sum of all entered numbers is: 60

Time Complexity:
O(n)

Why?
- The loop processes each input exactly once.
- If the user enters n numbers, the loop executes n times.
- Therefore, the running time is proportional to the number of inputs.

Space Complexity:
O(1)

Why?
- The program uses only a few variables:
    - sum
    - input
    - num
- No additional data structures are used.
- Hence, the memory usage remains constant.

*/