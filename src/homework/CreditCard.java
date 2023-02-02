package homework;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Do you have a credit card?");
        String answer = input.next();

        if (answer.equals("yes")){
            System.out.println("what is your balance on the card?");
            int balance = input.nextInt();
            if (balance >= 1000){
                System.out.println("Pay it off immediately");
            }else {
                System.out.println("Spend more");
            }
        }
    }
}
