package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorEx {

    public static List<Student> sortStudByName() {
        return StudentDataBase.getAllStudents().
                stream().
                sorted(Comparator.comparing(Student::getName)).
                collect(Collectors.toList());
    }

    public static List<Student> sortStudByGpa() {
        return StudentDataBase.getAllStudents().
                stream().
                sorted(Comparator.comparing(Student::getGpa).reversed()).
                collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("sort by name");
        sortStudByName().forEach(System.out::println);
        System.out.println("sort by gpa");
        sortStudByGpa().forEach(System.out::println);
    }
}
