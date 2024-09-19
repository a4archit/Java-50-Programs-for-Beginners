import java.util.Scanner;

class Day06_sum_of_first_n_numbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of first " + n + " numbers is " + sum);
    }
    
}
