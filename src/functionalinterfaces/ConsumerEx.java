package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
     static Consumer<Student> studentConsumer = (s)-> System.out.println(s);
     static  Consumer<Student> c1 = (s) -> System.out.print(s.getName());
     static  Consumer<Student> c2 = (s) -> System.out.println(s.getActivities());
     static Consumer<String> c = (s) -> System.out.println(s.toUpperCase());
     static List<Student> studentList = StudentDataBase.getAllStudents();




    static void print() {
        System.out.println("print");
        studentList.forEach(studentConsumer);
    }

    static void printNameAndActivities() {
        System.out.println("printNameAndActivities");
        studentList.forEach(c1.andThen(c2));
     }

     static void printNameAndActivitiesConditions() {
         System.out.println("printNameAndActivitiesConditions");
         studentList.forEach((student -> {
            if (student.getGpa()>=3.9 && student.getGradeLevel()>=3) {
                c1.andThen(c2).accept(student);
            }
        }));

     }

    public static void main(String[] args) {

        c.accept("ashutosh tripathi jee");
        print();
        printNameAndActivities();// consume chaining
        printNameAndActivitiesConditions();

    }
}
