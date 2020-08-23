package streamsterminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class StreamsGroupByEx {

    static void groupStudentsBy () {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    static void customizedGroupStudentsBy () {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8 ? "Outstanding" : "Average"));
        System.out.println(studentMap);
    }

    static void twoLevelCustomizedGroupStudentsBy () {
        Map<Integer, Map<String,List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(  student -> student.getGpa()>=3.8 ? "Outstanding" : "Average" )));
        System.out.println(studentMap);
    }

    public static void main(String[] args) {
         //groupStudentsBy();
        //customizedGroupStudentsBy();
        twoLevelCustomizedGroupStudentsBy();
    }
}
