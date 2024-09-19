import java.util.Scanner;

class Day09_greatest_number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, greatest;
        
        System.out.print("Enter the numbers\n\ta: ");
        a = sc.nextInt();
        System.out.print("\tb: ");
        b = sc.nextInt();
        
        greatest = (a>b)?a:b;
        
        System.out.println("\nGreatest number is " + greatest);
        
    }
    
}
