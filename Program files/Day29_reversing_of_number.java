import java.util.Scanner;

class Day29_reversing_of_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n, r=0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        while (n>0){
            int ld; // last digit
            ld = n%10;
            	r = r*10 + ld;
            n /= 10;
        }
        
        System.out.println("Reversed = " + r);
        
        
    }
}    
