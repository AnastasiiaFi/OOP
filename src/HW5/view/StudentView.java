package HW5.view;

import HW5.data.Student;
import HW5.data.StudentGroup;

import java.util.List;

public class StudentView {
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }

    public void printOnConsole(List<StudentGroup> groups) {
        for (StudentGroup studentGroup : groups) {
            System.out.println(studentGroup.toString());
        }
    }

}