//Finds and prints Armstrong numbers within a given range using basic arithmetic operations.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        for(int num = a; num < b; num++){

            int sum = 0;
            int temp = num;

            while (temp > 0){
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp = temp / 10;

            }
            if(num == sum){
                System.out.print(num + " ");
            }
        }


        sc.close();
    }


}

/*
- Checks each number in the given range for the Armstrong condition.
- Extracts each digit and adds its cube to the sum.
- Prints the number if the calculated sum matches the original number.

Time Complexity: O(n)
Space Complexity: O(1)
*/