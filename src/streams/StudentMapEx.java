package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StudentMapEx {

    public static void main(String[] args) {
        List<String> studentNames = StudentDataBase.getAllStudents().
                stream().
                map(Student::getName).
                collect(Collectors.toList());
        System.out.println(studentNames);
    }
}
