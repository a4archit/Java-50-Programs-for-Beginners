import java.util.Scanner;
import java.util.Arrays;

class Day40_array_searching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {1,2,3,4,5};
        int element;
        
        System.out.println("Array = " + Arrays.toString(arr) + "\n");
        System.out.print("Enter element for search: ");
        element = sc.nextInt(); 
        
        for(int i=0; i<arr.length; i++){
            if (arr[i] == element){
                System.out.println(element + " found in array.");
                return;
            }
        }
        
        System.out.println(element + " not found in array.");
        
        
    }
}
