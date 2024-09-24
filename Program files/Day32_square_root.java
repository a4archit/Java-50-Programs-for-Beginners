import java.util.Scanner;

class Day32_square_root {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;
        double square_root;
        
        // taking user input
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        square_root = Math.sqrt(n);
        
        System.out.println(square_root);
        
    }
    
}
