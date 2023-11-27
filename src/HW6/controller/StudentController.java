package HW6.controller;

import HW6.data.Student;
import HW6.data.Teacher;
import HW6.service.StudentGroupService;
import HW6.service.StudentService;
import HW6.service.StudentSortService;
import HW6.view.StudentView;

import java.awt.*;
import java.time.LocalDate;
import java.util.Collections;

public class StudentController implements UserController<Student>{

    private final StudentService dataService = new StudentService();
    private StudentSortService sortService;
    private final StudentGroupService studentGroupService = new StudentGroupService(sortService);
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(dataService.getAll());
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup());
    }

    public void getStudentInStudentGroup(String firstName, String secondName){
        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentView.sendOnConsole(Collections.singletonList(student));
    }

    public void getSortedListStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedStudentGroup();
        studentView.sendOnConsole(students);
    }

    public void getSortedListByFIOStudentFromStudentGroup(){
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentView.sendOnConsole(students);
    }
}
