import java.util.Scanner;

class Day24_lowercase_to_uppercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        String str;
        System.out.print("Enter some text: ");
        str = sc.nextLine();
        
        System.out.println("Given text in upper case = " + str.toUpperCase());
        
        
    }
}    
