import java.util.Scanner;

class Day15_multiplication_table {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        System.out.println("\nMultiplication table of "+n+": ");
        
        for (int i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+i*n);
        }
    }
}
