
import java.util.ArrayList;

public class MainProgram {

    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("Ada Lovelace"));
        student.add(new Student("crma Wyman"));
        student.add(new Student("brace Hopper"));
        student.add(new Student("dary Coombs"));
        for (Student name : student) {
            System.out.println(name);
        }
    }
}
