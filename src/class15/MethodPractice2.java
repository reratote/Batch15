package class15;

public class MethodPractice2 {
    //create a method that takes a String reverse it and
    // return the reversed String
    // call the method revereStr

    MethodPractice2 mp = new MethodPractice2();
    static String reverseStr(String input) {
        String newStr=" ";
        for (int i = input.length()-1; i >=0 ; i--) {
            newStr+=input.charAt(i);
        }
        return newStr;
    }


}