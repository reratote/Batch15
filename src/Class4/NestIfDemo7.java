package Class4;

public class NestIfDemo7 {
    public static void main(String[] args) {



        boolean studyHard=true;
        int salary=90000;

        if(studyHard){
            System.out.println("WE get jobs");

            if(salary>100000){
                System.out.println("Lets buy tesla");
            }else{
                System.out.println("lets buy toyota");
            }


        }else {
            System.out.println("It might take a little longer for us to get the jobs");
        }
    }
}
