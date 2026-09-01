package LeetCode;

// LeetCode Problem 507: Perfect Number

public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {

        if(num == 1){
            return false;
        }
        int sum = 1;

        for(int i = 2; i * i <= num; i++){

            if(num % i == 0){

                sum += i;

                if(i != num / i){
                    sum += num / i;
                }
            }
        }

        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        int num = 28;
        PerfectNumber obj = new PerfectNumber();
        System.out.println(obj.checkPerfectNumber(num));
    }
}

// Approach: Check divisors only up to √n and add their corresponding divisor pairs to the sum.
// Time Complexity: O(√n)
// Space Complexity: O(1)
