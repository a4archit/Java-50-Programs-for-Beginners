import java.util.Scanner;

class Day19_area_of_rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int l, b, area = 0;
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breath: ");
        b = sc.nextInt();
        area = l * b;
        
        
        System.out.println("Area of rectangle is: " + area);
    }
}    

