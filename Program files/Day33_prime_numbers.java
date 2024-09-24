import java.util.Scanner;

class Day33_prime_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;
        boolean isPrime = true;
        String msg;
        
        // taking user input
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        if (n == 0 || n == 1){
            isPrime = false;
        } else {
            for (int i=2; i<n; i++){
                if (n%i == 0){
                    isPrime = false;
                    break;
                }
            }   
        }
        
        msg = isPrime?"prime":"not a prime";
        
        System.out.println(n + " is " + msg);
        
    }
    
}
