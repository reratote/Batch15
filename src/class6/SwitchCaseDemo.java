package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        String country="china";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()){

            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "Afganistan":
                System.out.println("Kebab");
                 break;
            default:
                System.out.println("Wrong country");
        }
    }
}
