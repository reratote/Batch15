package homework;

public class Mortgage {
    public static void main(String[] args) {
        float rate=4.5f;
        int price = 200000;
        if (rate < 4.5){
            System.out.println("User will not buy a house");
        } else {
            System.out.println("User will consider buying");
        } if (price < 200000){
            System.out.println("User take a loan");
        } else {
            System.out.println("User pay cash");
        }
    }
}
