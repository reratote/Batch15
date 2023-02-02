package class3;

public class IfElse_7 {
    public static void main(String[] args) {

        int money=150;
        System.out.println(money>=300);
        if(money>=300)
        {
            System.out.println("yay lets go for shopping");
        }


       if(money<300){
           System.out.println("lets save more");
           System.out.println("maybe i am spending too much on food");
       }

       int age=17;
        System.out.println(age<18);
       if(age<18)
           System.out.println(age);
       {
           System.out.println("time to play");
       }

       boolean inSyntaxBootCamp=true;
        if(false)
        {
            System.out.println("time to start practicing java");
        }

    }

}
