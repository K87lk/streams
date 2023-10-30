package student2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsTest {
    public static void main(String[] args) {
        List<Student2> students = new ArrayList<>();

        students.add(new Student2("Anna", 20));
        students.add(new Student2("Max", 25));
        students.add(new Student2("Arthur", 18));
        students.add(new Student2("Alice", 22));

        List<String> names = new ArrayList<>();
        for (Student2 student : students) {
            if (student.name.startsWith("A")) {
                student.age += 10;
                names.add(student.name);
            }
        }

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}

