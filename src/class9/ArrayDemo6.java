package class9;

public class ArrayDemo6 {
    public static void main(String[] args) {
        int [] numbers=new int[8];
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;
        numbers[3]=4;
        numbers[4]=5;
        numbers[5]=6;
        numbers[6]=7;
        numbers[7]=80;

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                sum=sum+numbers[i];
            }
        }
        System.out.println(sum);
    }
}
