package class14;

public class task3 {
    public static void main(String[] args) {
        String str="Is it saturday? is it raining? Do we have Java class today?";
        String[]arr=str.split("[?]");
        System.out.println(arr.length);
        System.out.println(arr[2]);
    }
}
