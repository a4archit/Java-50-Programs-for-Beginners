
import java.util.Arrays;

class Day41_array_in_ascending_order {
    public static void main(String[] args) {
        
        int arr[] = {1,6,3,9,2};
        int asc[] = ascending(arr);
        System.out.println(Arrays.toString(asc));
    }

    public static int[] ascending(int arr[]){
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
    }
}
