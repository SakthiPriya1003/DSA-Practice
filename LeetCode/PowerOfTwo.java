package LeetCode;
//Leetcode problem number: 231
import java.util.*;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        if(n <= 0){
            return false;
        }
        else if((n & (n - 1)) == 0){ // If n is a power of 2, n and n-1 have no common 1 bit
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        PowerOfTwo obj = new PowerOfTwo();

        System.out.println(obj.isPowerOfTwo(n));

        sc.close();
    }
}