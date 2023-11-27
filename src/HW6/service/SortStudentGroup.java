package HW6.service;


//Принцип разделения интерфейсов, чтобы разбить сортировки на более узкие интерфейсы*/

import HW6.data.Student;

import java.awt.*;

public interface SortStudentGroup extends StudentSortService{
    @Override
    List<Student> sortStudents();
}