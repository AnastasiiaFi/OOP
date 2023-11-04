package HW4.controller;

import HW4.data.Teacher;
import HW4.data.UserComparator;
import HW4.service.TeacherServise;
import HW4.view.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherServise dataService = new TeacherServise();
    private final TeacherView teacherView = new TeacherView();
    public void create( String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }
    public void edit(Long teacherId,String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {

        dataService.updateById(teacherId, firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }
    public void view(){

        List<Teacher> teachers = dataService.getAll();

        UserComparator comparator = new UserComparator();
        teachers.sort(comparator);

        System.out.println("Список учителей:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }
    }

}
