import java.util.Scanner;

class Day34_prime_numbers_between_range {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int min, max;
        boolean isprime = true;
        String msg;
        
        // taking user input
        System.out.print("Enter minimum: ");
        min = sc.nextInt();
        System.out.print("Enter maximum: ");
        max = sc.nextInt();
        
        System.out.println("\n\nPrime numbers between "+min+"-"+max+": ");
        for (int i=min; i<max; i++){
            msg = isPrime(i)?" "+i:"";
            System.out.print(msg);
        }
    }
        
        
    public static boolean isPrime(int n){
        boolean isprime = true;
        if (n == 0 || n == 1){
            isprime = false;
        } else {
            for (int i=2; i<n; i++){
                if (n%i == 0){
                    isprime = false;
                    break;
                }
            }   
        }
        return isprime;
    }
}
