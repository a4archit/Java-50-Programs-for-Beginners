import java.util.Scanner;

class Day30_is_palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n, NUM, r=0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        NUM = n;
        
        while (n>0){
            int ld; // last digit
            ld = n%10;
            	r = r*10 + ld;
            n /= 10;
        }
        
        String pmsg;
        
        pmsg = (NUM == r)?"palindrome":"not a palindrome";
        
        System.out.println(NUM + " is " + pmsg);
        
        
    }
}    
