package class16;

public class task5 {
    //write a method to return whether given number is prime or not
   boolean isPrime(int number){
       boolean flag=true;
       if (number>1){
           for (int i = 2; i < number; i++) {
               if(number%i==0){
                   flag = false;
                   break;
               }
           }
       }else {
           flag=false;
       }
       return flag;

   }



    public static void main(String[] args) {
       task5 task5=new task5();
        System.out.println(task5.isPrime(13));

    }



    }





