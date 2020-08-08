package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

    static void print() {
        Consumer<Student> studentConsumer = (s)-> System.out.println(s);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
        c.accept("ashutosh tripathi jee");
        print();

    }
}
