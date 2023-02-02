package class16;

public class Student {
       String name;
       String id;
      static int noOfStudents;

    public static void main(String[] args) {

        Student st=new Student();
        st.name="Regina";
        st.id="2";
        st.noOfStudents++;

        Student st1=new Student();
        st.name="Ramina";
        st.id="1";
        st1.noOfStudents++;
        System.out.println(Student.noOfStudents);


    }

}
