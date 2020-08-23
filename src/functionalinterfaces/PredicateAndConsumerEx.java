package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerEx {

    Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3;
    Predicate<Student> p2 = (s)->s.getGpa()>=3.9;

    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa) -> gradeLevel>=3 && gpa>=3.9;

    BiConsumer< String, List<String>> b1 = (name,activities) -> System.out.println(name+ " : " +activities);

    Consumer<Student> studentConsumer = (student -> {
       //if(p1.and(p2).test(student)) {
        if (biPredicate.test(student.getGradeLevel(),student.getGpa())){
           b1.accept(student.getName(),student.getActivities());
       }
    });

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerEx().printNameAndActivities(studentList);
    }

    private void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }
}
