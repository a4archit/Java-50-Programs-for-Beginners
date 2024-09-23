import java.util.Scanner;

class Day25_nature_of_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        String nature;
        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
        nature = (n>=0)?"Positive":"Negative";
        
        System.out.println(n + " is " + nature);
        
        
    }
}    
