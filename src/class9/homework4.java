package class9;

import java.util.Scanner;

public class homework4 {
    /*1)Write a program to ask a user to enter item they want
     to buy and the price of that item.
     2)Every time user enters price accumulate the price and 4)tell the
     user how much total that they should pay.
     4)if user give more money program should return a change.
     5)whenever a user done with payments program should say "Thank you for shopping!"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please enter the price and its price");
            String itemName = scan.next();
            double itemPrice = scan.nextDouble();
            totalPrice = totalPrice + itemPrice;
            System.out.println("This is the total amount that you have to pay " + totalPrice);
        }
            System.out.println("Please pay for the items");
            double amountPaid = scan.nextDouble();
            if(amountPaid>totalPrice){
                System.out.println("Here is your change");
            }else{
                System.out.println("Thank you for shopping");
            }
        }
    }

