// Search for the target element in a sorted array using binary search.
// The search range is reduced by checking the middle element each time.

public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,11,25,30};
        int t = 11;
        int left = 0;
        int right = arr.length - 1;
        int flag = 0;
        while(left <= right){
            int mid = left + ((right-left)/2);

            if(arr[mid] == t){
                flag = 1;
                break;
            }
            else if(arr[mid] > t){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        if(flag == 0){
            System.out.println("Not Found");
        }else{
            System.out.println("Found");
        }
    }
}