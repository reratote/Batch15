package homework;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of worked year");
        int years = input.nextInt();
        System.out.println("Enter annual salary");
        int salary = input.nextInt();
         if (years >= 5){
             System.out.println(" You are eligible for the bonus");
         } else {
             System.out.println("You are not eligible for the bonus");
         } if (salary >=50000){
            System.out.println("Bonus=5000");
        } else {
            System.out.println("Bonus=3000");
        }

    }
}
