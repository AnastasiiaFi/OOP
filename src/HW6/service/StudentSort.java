package HW6.service;

import HW6.data.Student;
import HW6.data.StudentGroup;
import HW6.data.UserComparator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class StudentSort extends StudentGroupQueryService implements StudentSortService{
    private final StudentGroup studentGroup;

    public StudentSort(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public List<Student> sortStudents() {
        return null;
    }
    public List<Student> getSortedStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students);
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup(){
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }

    @Override
    Student findStudent(String firstName, String secondName) {
        return null;
    }

    @Override
    List<Student> sortStudents(StudentGroup studentGroup) {
        return null;
    }
}