package class9;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        /*Write a program that reads a range of integers
        (start and end point), provided by a user and then
        from that range prints the sum of the even and odd integers.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter two number starting point and ending point");
        int start= scan.nextInt();
        int end= scan.nextInt();

        System.out.println("start "+start+" end "+end);
        int evenSum=0;
        int oddSum=0;

        for (int i = start; i <=end ; i++) {
            if(i%2==0){
                evenSum+=i;// can also be written like evenSum=evenSum+i
            }else {
                oddSum=oddSum+i; //can also be written like this oddSum+=i
            }
        }
        System.out.println("Sum of all even number "+evenSum);
        System.out.println("Sum of all odd number "+oddSum);
    }
}
