package Class4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money=15000;
        if(money>1000){
            System.out.println("Lets Buy an Iphone");
        }

        if(money>2000){
            System.out.println("Let also buy a Macbook");
        }

        boolean motherDay=true;

        if(motherDay){
            System.out.println("Happy Mothers Day");
        }
        String name="Sardar";

        //equals means is only used for non-primitives
        if(name.equals("Sardar")){
            System.out.println("I love football");
        }
    }
}
