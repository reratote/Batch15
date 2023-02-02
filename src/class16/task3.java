package class16;

public class task3 {
    /*
    create a method that will print
     whether given String is palindrome or not

     return type=>void
     name=>ispalidrome
     parameters=>String inputStr
     {
     }
     */
    void isPalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" not is palindrome");
        }
    }

    public static void main(String[] args) {
      task3 task3=new task3();
      task3.isPalindrome("Kaya");

    }
}
