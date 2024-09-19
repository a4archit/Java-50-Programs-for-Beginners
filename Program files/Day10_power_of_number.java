import java.util.Scanner;

class Day10_power_of_number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n, p, power;
        
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.print("\nEnter value of power: ");
        p = sc.nextInt();
        
        power = Math.pow(n,p);
        
        System.out.println("\n"+n+"^"+p+" = " + power);
        
    }
    
}
