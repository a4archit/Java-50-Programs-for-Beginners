import java.util.Scanner;

class Day26_leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        String msg;
        int year;
        System.out.print("Enter year: ");
        year = sc.nextInt();
        
        msg = ((year%4==0) && (year%100!=0) || (year%400==0))?"Leap year":"Not a leap year";
        
        System.out.println(msg);
        
        
    }
}    
