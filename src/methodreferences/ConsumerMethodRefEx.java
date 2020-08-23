package methodreferences;


import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodRefEx {

    static Consumer<Student> c1 = System.out::println;

    static Consumer<Student> c2 = Student::printActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);

    }

}