import java.util.Scanner;

class Day07_ASCII_value_of_character {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = sc.nextLine().charAt(0);
        
        int ascii = (int)ch;
        
        System.out.println("ASCII value of " + ch + " = " + ascii);
    }
    
}
