package class15;

public class MPractice6 {
    String createEmail(String userName, String LastName,String emailType){
        return userName+LastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        MPractice6 MPractice6=new MPractice6();
        System.out.println(MPractice6.createEmail("John","Snow","gmail.com"));
    }





}
