package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentEx {

    static  Predicate<Student> p1 = student -> student.getGradeLevel()>=3;
    static  Predicate<Student> p2 = student -> student.getGpa()>=3.9;

    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().
                stream().
                peek(student -> System.out.println(student)).
                filter(p1).
                filter(p2).
                collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap.toString());
    }
}
