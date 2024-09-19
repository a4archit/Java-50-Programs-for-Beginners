import java.util.Scanner;

class Day04_EvenOrOdd {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        String numType = (num%2==0)?"Even":"Odd";
        
        System.out.println(numType);
        
    }
    
}
