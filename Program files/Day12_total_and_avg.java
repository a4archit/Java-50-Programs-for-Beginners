import java.util.Scanner;

class Day12_total_and_avg {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i,total = 0;
        float avg;
        
        for(i=1; i<=5; i++){
            int sub;
            System.out.print("Enter the marks of subject "+i+": ");
            sub = sc.nextInt();
            total += sub;
        }
        avg = total/5;
        
        System.out.println("\nTotal: "+total+"\nAverage: "+avg);
        
    }
}
