
import java.util.Scanner;

class Day21_area_of_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int h, b;
        double area = 0;
        System.out.print("Enter height: ");
        h = sc.nextInt();
        System.out.print("Enter base: ");
        b = sc.nextInt();
        area = (b*h)/2;
        
        
        System.out.println("Area of triangle is: " + area);
    }
}    

