import java.util.Scanner;

class Day13_factorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n,fact = 1;
        
        System.out.print("Enter a num: ");
        n = sc.nextInt();
        
        for (int i=n; i>=1; i--){
            fact *= i;
        }
        
        System.out.println("\nFactorial = "+fact);
        
    }
}
