package student;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Nick", 23));
        students.add(new Student("John", 26));
        students.add(new Student("Rick", 28));
        students.add(new Student("Anne", 42));
        students.add(new Student("Johnny", 16));
        students.add(new Student("Alexander", 14));
        students.add(new Student("Maria", 18));
        students.add(new Student("Rookie", 53));

        students.removeIf(student -> student.getName().contains("k"));

        students.forEach(student -> student.setAge(student.getAge() + 10));

    }
}
