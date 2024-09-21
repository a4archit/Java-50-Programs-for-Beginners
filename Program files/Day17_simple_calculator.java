import java.util.Scanner;

class Day17_simple_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double a, b, result = 0.0;
        char op;
        
        System.out.print("Enter numbers ->\n\ta: ");
        a = sc.nextDouble();
        System.out.print("\tb: ");
        b = sc.nextDouble();
        System.out.print("\nEnter operator(+,-,*,/): ");
        op = sc.next().charAt(0);
        
        switch(op){
            case '+':{
                result = a+b;
                break;
            } case '-':{
                result = a-b;
                break;
            } case '*':{
                result = a*b;
                break;
            } case '/':{
                if(b == 0){
                    System.out.println("Can't divide by zero.");
                    return;
                }
                result = a/b;
                break;
            } default:{
                System.out.println("Invalid operator.");
            }
        }
        
        System.out.println("\n\nResult = " + result);
        
        
    }
}
