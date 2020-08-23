package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapEx {

    public static void main(String[] args) {
        List<String> studentActivities = StudentDataBase.getAllStudents().
                stream().map(Student::getActivities).
                flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
        System.out.println(studentActivities);


    }
}
