package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalFlatMapEx {

    static  void optionalFlatmap() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<String> name = optionalStudent.filter(student -> student.getGpa()>=3.5).
                flatMap(Student::getBike)
                .map(Bike::getName);

        System.out.println(name.get()   );
    }

    public static void main(String[] args) {
        optionalFlatmap();
    }
}
