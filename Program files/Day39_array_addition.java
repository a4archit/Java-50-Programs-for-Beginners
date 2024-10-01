import java.util.Scanner;
import java.util.Arrays;

class Day39_array_addition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sum[];
        int a[] = {1,2,3,4,5};
        int b[] = {1,0,1,0,1};
        
        sum = add(a,b);
        
        System.out.println(" " + 
             "\na = " + Arrays.toString(a) + 
             "\nb = " + Arrays.toString(b) + 
             "\na+b = " + Arrays.toString(sum));
        
    }
    
    public static int[] add(int a[], int b[]){
        if (a.length != b.length){
            System.out.println("Arrays a and b must of same length");
        }
        
        int sum[] = Arrays.copyOf(a,a.length);
        
        for (int i=0; i<a.length; i++){
            sum[i] = a[i] + b[i];
        }
        
        return sum;
    }
}
