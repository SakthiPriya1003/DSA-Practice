public class WindowSum {
    public static void main(String args[]){

        int[] arr = {3,4,5,2,7,9,11,2,5,8};
        int k = 4;
        int left = 0;
        int window_sum = 0;
        int max = -1;
        

        for(int i = 0; i < k; i++){
            window_sum += arr[i];
        }

        max = window_sum;

        for(int right = k; right < arr.length; right++){
            window_sum = window_sum - arr[left] + arr[right];
            if(window_sum > max){
                max = window_sum;
            }
            left++;
        }
    }
}
