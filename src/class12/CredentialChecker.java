package class12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CredentialChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your userName");
        String userName=scanner.next();
        System.out.println("Please Enter your Password");
        String password=scanner.next();
        System.out.println("Please Enter your Password Again");
        String confirmPassword=scanner.next();
        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("Username or password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is too short");
        } else if (password.contains(userName)) {
            System.out.println("Password cannot contains username");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Password do not match");
        } else {
            System.out.println("YOur username and password has been created");
        }
    }
}
