import java.util.Scanner;

class Day31_armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n;
        String armstrong_msg;
        
        // taking user input
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        armstrong_msg = isArmstrong(n);
        
        System.out.println(n + " is " + armstrong_msg);
        
    }
    
    public static String isArmstrong(int n){
        
        // getting number of digits
        int digits = 0;
        int temp = n;
        while (temp > 0){
            digits++;
            temp /= 10;
        }
        
        int sum = 0;
        temp = n;
        for (int i=0; i<digits; i++){
            
            int ld = temp%10;
            sum += Math.pow(ld, digits);
            temp /= 10;
        }
        
        return (sum == n)?"armstrong":"not an armstrong";
    }
}    
