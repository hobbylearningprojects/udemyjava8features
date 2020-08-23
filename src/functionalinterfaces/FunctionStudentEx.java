package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentEx {

    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {
        Map<String,Double> studentGpaMap = new HashMap<>();
        students.forEach((student -> {
            if (PredicateStudentEx.p1.test(student))
                studentGpaMap.put(student.getName(),student.getGpa());
        }));
        return  studentGpaMap;
    });

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println(studentFunction.apply(studentList));

    }
}
