package Class8;

public class BreakKeywordDemo3 {
    public static void main(String[] args) {


        boolean summer = true;
        int temp = 75;

        while (temp<=105) {

            if (temp <= 100) {
                System.out.println("I love summer because temp is " + temp);
            } else {
                System.out.println("Its very hot " + temp);
                break;
            }
            temp += 5;
        }
    }

}