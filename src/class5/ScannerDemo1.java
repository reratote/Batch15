package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
       /* System.out.println("Please Enter Your age");
        int age= scanner.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please enter your weight");
        double weight=scanner.nextDouble();
        System.out.println("Your weight is "+weight+" lbs");

        System.out.println("Are you hungry?");
        boolean hungry=scanner.nextBoolean();
        System.out.println("Hungry "+hungry);



        System.out.println("Please enter your gender");
        char gender=scanner.next().charAt(0); // char type of input
        System.out.println("YOur gender is "+gender);
         */

        System.out.println("please Enter your  name");
        String name = scanner.nextLine();
        System.out.println("Your name "+name);

        scanner.nextLine();
        System.out.println("Please Enter your full name");
        String fullName= scanner.nextLine();
        System.out.println("Your full name is "+fullName);
    }
}
