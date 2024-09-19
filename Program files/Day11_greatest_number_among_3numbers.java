import java.util.Scanner;

class Day11_greatest_number_among_3numbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, greatest;
        
        System.out.print("Enter the numbers\n\ta: ");
        a = sc.nextInt();
        System.out.print("\tb: ");
        b = sc.nextInt();
        System.out.print("\tc: ");
        c = sc.nextInt();
        
        greatest = (a>b && a>c)?a:(b>c)?b:c;
        
        System.out.println("\nGreatest number is " + greatest);
        
    }
    
}
