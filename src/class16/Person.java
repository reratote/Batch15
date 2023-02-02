package class16;

public class Person {
    private double bankBalance=1200000;
    String Address="Street 123";
    String name="JOn Snow";

    private void printPhonePassword(){
        System.out.println("pass123");
    }
    void printSSN(){
        System.out.println("123456789");
    }

    public void printTikTokAccount(){
        System.out.println("TikTok");
    }

    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
    }
}
