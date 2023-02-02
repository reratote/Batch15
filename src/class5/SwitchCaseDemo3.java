package class5;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        // we can use only byte short int char String
       /* boolean rich=true;
        switch (rich){

        }*/
        // we cant use relational operators in switch case statement
        /* int number=10;
         switch(number){
             case number>5 || number<<10
         }*/
       String day="Tuesday";

       switch (day){
           case "Monday":
               System.out.println("1");
               break;
           case"Tuesday":
               System.out.println("2");
               break;
           case "Wednesday":
               System.out.println("3");
               break;
           default:
               System.out.println("Wrong day");
               break;




       }







    }
}
