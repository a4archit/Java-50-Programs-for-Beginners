
import java.util.Scanner;

class Day20_area_of_square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int l;
      	double area = 0;
        System.out.print("Enter length: ");
        l = sc.nextInt();
        area = Math.pow(l,2);
        
        
        System.out.println("Area of rectangle is: " + area);
    }
}    

