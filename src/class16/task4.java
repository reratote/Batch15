package class16;

public class task4 {
    /*
    create a method that will say Hello
     in different language based on the country
     that will be passed when method is executed
     return type=>String void
     name= sayHello
     parameter=> String countryName
     */
    String sayHello(String countryName) {
        switch (countryName) {

            case "USA":
                return "Hello";// break is not needed
            case "Kazakhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";
        }
    }

    public static void main(String[] args) {
        task4 task4=new task4();
        System.out.println(task4.sayHello("USA"));
    }

}
