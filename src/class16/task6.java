package class16;

public class task6 {
    public static void main(String[] args) {
        task6 task6 = new task6();
        System.out.println(task6.getGrade(70));
    }
    char getGrade(int score) {

        if (score >= 90 && score < 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 50 && score < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
