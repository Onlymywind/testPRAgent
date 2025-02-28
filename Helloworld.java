import bean.Student;

import java.util.List;
import java.util.stream.Collectors;

public class Helloworld {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student(1, "Abel", 22, "male"),
                new Student(2, "Sonic", 14, "male"),
                new Student(3, "Tails", 9, "male"),
                new Student(4, "Knuckles", 15, "male"),
                new Student(5, "Amy", 14, "female"),
                new Student(6, "Shadow", 20, "male"));
        List<Student> youngMale = studentList.stream()
                .filter(student -> student.getGender().equals("male"))
                .filter(student -> student.getAge() < 15)
                .collect(Collectors.toList());
        youngMale.forEach(System.out::println);
    }
}
