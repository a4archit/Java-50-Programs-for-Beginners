import java.util.Scanner;

class Day18_area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float r;
        double area;
        
        System.out.print("Enter radius: ");
        r = sc.nextFloat();
        
        area = Math.round(Math.PI * Math.pow(r,2));
        
        System.out.println("\nArea of circle = "+area);
    }
}
