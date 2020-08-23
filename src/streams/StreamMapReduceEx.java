package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceEx {

    static int noOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream().
                map(Student::getNoteBooks).reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("total notebooks " + noOfNoteBooks());
    }
}
