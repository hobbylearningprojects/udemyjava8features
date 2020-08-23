package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerEx {

    static  List<Student> studentList = StudentDataBase.getAllStudents();

    static void printNameActivities () {
        BiConsumer<String, List<String>> biConsumer = (name,activities)-> System.out.println(name + " : "+ activities);
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a,s)->{
            System.out.println("a :" + a + ", s :"+s);
        };

        biConsumer.accept("ashu","sonu");
        printNameActivities();

    }
}
