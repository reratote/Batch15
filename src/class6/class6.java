package class6;

import java.util.Scanner;

public class class6 {
    public static void main(String[] args) {
        System.out.println("please enter the day");
        Scanner scan=new Scanner(System.in);

        String day = scan.next();

        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Friday")) {
            System.out.println("No class today Enjoy");
        } else if(day.equalsIgnoreCase("Thursday")){
                System.out.println("Review class");
            }else {
                System.out.println("Wrong day entered");
            }
}}
