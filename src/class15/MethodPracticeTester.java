package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice mp=new MethodPractice();
        boolean isEven= mp.isEven1(15);
        System.out.println(isEven);

        boolean isEven2=mp.isEven1(100);
        System.out.println(isEven2);
        System.out.println(mp.isEven1(12));
        System.out.println(mp.isEven1(20));
    }
}
