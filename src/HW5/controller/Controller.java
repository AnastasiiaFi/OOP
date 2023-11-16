package HW5.controller;


import HW5.data.*;
import HW5.service.DataService;
import HW5.service.StudentGroupService;
import HW5.view.StudentView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private DataService service = new DataService();
    private StudentGroupService groupService = new StudentGroupService();
    private StudentView studentView = new StudentView();

    public void createTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        service.create(firstName, secondName, patronymic, dateOfBirth, Type.TEACHER);
    }
    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        service.create(firstName, secondName, patronymic, dateOfBirth, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user : userList){
            studentView.printOnConsole((Student) user);
        }
    }

    public List<Student> getListOfStudents(){
        List<User> userList = service.getAllStudent();
        List<Student> students = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student){
                students.add((Student) user);
            }
        }
        return students;
    }
    public void createGroup(Teacher teacher, List<Student> students){
        groupService.createGroup(teacher, students);
        studentView.printOnConsole(groupService.getGroups());
    }

}
