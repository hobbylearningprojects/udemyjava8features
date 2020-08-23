package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterEx {

    static List<Student> filterStud() {
       return StudentDataBase.getAllStudents().stream().
                filter((student -> student.getGender().equals("female"))).
                filter((student -> student.getGpa()>=3.9)).
                collect(Collectors.toList());
    }

    public static void main(String[] args) {
        filterStud().forEach(System.out::println);
    }
}
