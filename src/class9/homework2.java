package class9;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        /* create a program that will be asking user apply for a credit card 10 times
        as soon you get "yes" form a user program should stop asking
        */

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want a credit card?");
            String userResponse= scan.next();
            if(userResponse.equalsIgnoreCase("yes")){
                break;
            }
        }


    }
}
