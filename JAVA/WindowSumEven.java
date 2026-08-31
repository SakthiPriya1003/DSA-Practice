public class WindowSumEven {
    public static void main(String[] args){

        int[] arr = {3, 2, 5, 8, 9, 12, 15};
        int k = 3;

        int left = 0;
        int max = -1;
        int windowSum = 0;

        for(int i = 0; i < k; i++){
            if(arr[i] % 2 == 0){
                windowSum += arr[i];
            }
        }

        max = windowSum;

        for(int right = k; right < arr.length; right++){
            if (arr[left] % 2 == 0){
                windowSum = windowSum - arr[left];
            }
            if(arr[right] % 2 == 0){
                windowSum = windowSum + arr[right];
            }

            if(windowSum > max){
                max = windowSum;
            }
            left++;
        }

        System.out.println(max);

    }
}
