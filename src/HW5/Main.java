package HW5;

import HW5.controller.Controller;
import HW5.data.Teacher;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Controller controler = new Controller();
//        controler.createStudent("1", "1","1","1");
//        controler.createStudent("2", "2","2","2");
//        controler.createStudent("3", "3","3","3");
//        controler.createStudent("4", "4","4","4");
        controler.createStudent("Имя",
                "Фамилия",
                "Отчество",
                LocalDate.of(1998, 1,1));
        controler.createStudent("Имя1",
                "Фамилия1",
                "Отчество1",
                LocalDate.of(1998, 10,10));
        controler.createTeacher("Ями - Учитель",
                "Яилимаф",
                "Отчество",
                LocalDate.of(1998, 1,1));
        controler.getAllStudent();
        controler.createGroup(new Teacher("Ями - Учитель",
                "Яилимаф",
                "Отчество",
                LocalDate.of(1998, 1,1), 19),
                controler.getListOfStudents());

    }
}