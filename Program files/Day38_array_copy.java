import java.util.Scanner;
import java.util.Arrays;

class Day38_array_copy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a[] = {1,2,3,4,5,6,7,8,9};
        
        int b[];
        
        b = Arrays.copyOf(a,a.length);
        
        System.out.println("Array B = \n" + Arrays.toString(b));
        
    }
}    
