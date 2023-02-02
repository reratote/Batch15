package homework;

import java.util.Scanner;

public class LoanSpecialist2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How much money would you like to borrow?");

        int loan = input.nextInt();
        if (loan < 200000) {
            System.out.println("Lend the money");
        } else {
            System.out.println("Reject the money");
        }
    }
}
