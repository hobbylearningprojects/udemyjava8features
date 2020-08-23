package streamsterminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsJoiningEx {

    static String joining_1() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    static String joining_2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","{","}"));
    }

    static long count () {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }

    static List<String> joining_3() {
        return StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName,toList()));
    }

    static Optional<Student> getMinByGpaStud() {
        return  StudentDataBase.getAllStudents().stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(count());
        System.out.println(joining_3());
        if (getMinByGpaStud().isPresent()) System.out.println(getMinByGpaStud().get());
    }
}
