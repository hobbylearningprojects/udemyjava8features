package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentEx {

    //static  Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3;
    static  Predicate<Student> p1 = (s)-> s.getGpa()>=3.9;

    static void filterByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {
        filterByGradeLevel();

    }
}
