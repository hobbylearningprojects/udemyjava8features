package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

import static data.StudentDataBase.studentSupplier;

public class OptionalEx {

    static Optional<String> getStudName() {
        Optional<Student> studentSupplier = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> studentSupplier = Optional.ofNullable(null);
        if (studentSupplier.isPresent()) {
            return studentSupplier.map(Student::getName);
        }
        return  Optional.empty();
    }

    public static void main(String[] args) {
        Optional<String> stringOptional = getStudName();
        if (stringOptional.isPresent()) System.out.println("student name :" + stringOptional.get());
        else {
            System.out.println("name not found");
        }
    }
}
