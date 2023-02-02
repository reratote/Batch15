package homework;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What city do you live in?");
        String city = input.next();
        System.out.println("What is the temperature there in F?");
        double T = input.nextDouble();
        System.out.println("The temperature is "+(T-32)*5/9+ " celsius");
    }
}
