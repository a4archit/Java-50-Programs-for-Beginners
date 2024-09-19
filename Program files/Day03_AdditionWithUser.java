import java.util.Scanner;

class Day03_AdditionWithUser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // declaring 
        int a, b, sum;
        
        // taking user input
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        
        sum = a+b;
        
        System.out.println("Addition of two numbers: ");
    }
}
