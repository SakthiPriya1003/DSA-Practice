// Find the sum of all odd numbers in the array.

public class AlternateSum {
    
    public static void main (String[] args){

        int[] arr = {3,1,5,7,4,20,10};
        int sum = 0;
        // Loop through the array and add only the odd numbers to the sum.
        for(int i = 0; i < arr.length; i++){

            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
