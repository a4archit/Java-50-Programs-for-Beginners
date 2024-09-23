import java.util.Scanner;

class Day27_divisibility_of_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        String msg;
        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        msg = (n%5==0)?"divisible by 5":"not divisible by 5";
        
        System.out.println(n + " " + msg);
        
        
    }
}    
