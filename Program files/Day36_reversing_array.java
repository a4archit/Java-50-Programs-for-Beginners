
import java.util.Arrays;
import java.util.Scanner;

class Day36_reversing_array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // initialising array
        int arr[] = {1,2,3,4,5,6,7,8,9};
        // displaying array
        System.out.println(Arrays.toString(arr));
        // reversing the array
        reverse(arr);
        // displaying reversed array
        System.out.println(Arrays.toString(arr));
        
    }

    // method that perforem reversing
    public static void reverse(int[] arr){
        int temp = 0;
        int left = 0, right = arr.length-1;
        
        while( left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }
}

