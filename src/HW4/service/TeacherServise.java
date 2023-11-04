package HW4.service;

import HW4.data.Teacher;

import java.time.LocalDate;
import java.time.chrono.ThaiBuddhistEra;
import java.util.ArrayList;
import java.util.List;

public class TeacherServise implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherServise(){

        this.teachers = new ArrayList<>();
    }
    public List<Teacher> getAll(){
        return teachers;
    }
    public void create (String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        Long countMaxId = 0L;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() > countMaxId){
                countMaxId = teacher.getTeacherId();
            }

        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teacher.setTeacherId(countMaxId);

        teachers.add(teacher);
    }
    public void updateById(Long teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth ) {

        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            if (teacher.getTeacherId() == teacherId) {
                teacher.setFirstName(firstName);
                teacher.setSecondName(secondName);
                teacher.setPatronymic(patronymic);
                teacher.setDateOfBirth(dateOfBirth);
                return;
            }
        }
    }
}
