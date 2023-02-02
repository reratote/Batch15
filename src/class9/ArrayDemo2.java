package class9;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //10 20 30 45 50

        int [] numbers= {10,20,30,35,50};
        System.out.println(numbers.length);
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
            System.out.println(sum);
        }

        }
    }

