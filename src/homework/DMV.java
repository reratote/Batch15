package homework;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        if (age >=18){
            System.out.println("You are getting a driver licence");
        } else {
            System.out.println("You are not getting a driver licence");
        }
    }
}
