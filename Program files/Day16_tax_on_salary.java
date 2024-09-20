import java.util.Scanner;

class Day16_tax_on_salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary;
        float tax_rate;
        double tax;
        
        System.out.print("Enter your salary(in LPA): ");
        salary = sc.nextInt();
        
        if (salary < 250000){
            tax_rate = 0;
        } else if (salary >= 250000 && salary < 500000){
            tax_rate = 5;
        } else if (salary >= 500000 && salary < 750000){
            tax_rate = 10;
        } else if (salary >= 750000 && salary < 1000000){
            tax_rate = 15;
        } else if (salary >= 1000000 && salary < 1250000){
            tax_rate = 20;
        } else if (salary >= 1250000 && salary < 1500000){
            tax_rate = 25;
        } else {
            tax_rate = 30;
        }
        
        tax = Math.round((tax_rate*salary)/100);
        
        System.out.println("Tax rate = "+tax_rate+"%"+"\nTotal tax = "+tax+"/-");
        
        
    }
}
