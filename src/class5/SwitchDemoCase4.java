package class5;

import java.util.Scanner;

public class SwitchDemoCase4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Gender M/F");
        char gender=scanner.next().charAt(0);

        switch(gender){

            case'F':
                System.out.println("Female");
                break;
            case'M':
                System.out.println("Males");
                break;
            default:
                System.out.println("not specified");
        }
    }
}
