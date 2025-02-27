import bean.Student;

import java.util.List;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("hello world");
        Student student = new Student();
        student.setAge(18);
        student.setGender("boy");
        student.setName("abel");
        List<Student> studentList = List.of(student);
        System.out.println(studentList);
    }
}
