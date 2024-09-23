import java.util.Scanner;

class Day22_swapping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int a,b;

        a = 10;
        b = 20;
        
        // displaying numbers before swapping
        System.out.println("\n\nBefore swapping \n\ta = " + a + "\n\tb = " + b);
        
        // swapping
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("\n\nAfter swapping\n\ta = " + a + "\n\tb = " + b);
        
    }
}    
    
