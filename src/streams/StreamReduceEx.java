package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceEx {

    static  int doMultiply(List<Integer> list) {
        return list.stream().
                reduce(1,(a,b)-> a*b);
    }

    static Optional<Student> getHighestGpaStud() {
        return StudentDataBase.getAllStudents().stream().
                reduce((s1,s2) -> (s1.getGpa() >= s2.getGpa() ? s1:s2));
    }

    public static void main(String[] args) {
        System.out.println(doMultiply(Arrays.asList(1,3,5,7)));
        Optional<Student>  getOptionalStud = getHighestGpaStud();
        if (getOptionalStud.isPresent()) System.out.println(getOptionalStud.get());
    }
}
