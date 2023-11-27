package HW6.service;

//Согласно принципу Открытости/Закрытости,
//создаем абстрактный класс для реализации его методов
//в наследниках.
//Так же согласно принципу Liskov Substitution,
//создаем абстрактный класс для реализации его методов,
//чтобы работать с наследниками через полиморфизм.
//

import HW6.data.Student;
import HW6.data.StudentGroup;

import java.awt.*;

abstract class StudentGroupQueryService {
    abstract Student findStudent(String firstName, String secondName);
    abstract List<Student> sortStudents(StudentGroup studentGroup);
}