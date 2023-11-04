package HW4;

import HW4.controller.TeacherController;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Имя",
                "Фамилия",
                "Отчество",
                LocalDate.of(1998, 1,1));

        teacherController.create("Имя1",
                "Фамилия1",
                "Отчество1",
                LocalDate.of(1998, 10,10));


        teacherController.edit(2L, "Обновленное имя",
                "Обновленная фамилия",
                "Обновленное отчество",
                LocalDate.of(1996, 12,12));


        teacherController.view();
    }
}
