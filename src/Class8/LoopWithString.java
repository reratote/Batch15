package Class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name");
        while (scanner.next().equalsIgnoreCase("Sha")) ;
        {
            System.out.println("Great student who always wanted an example with String in loop");
        }
    }
}
