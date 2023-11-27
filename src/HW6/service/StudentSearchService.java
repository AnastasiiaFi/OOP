package HW6.service;

//Интерфейс для поиска студента.
//Применяем принцип единственной ответственности SRP,
//разбив класс StudentGroupService на отдельные классы

import HW6.data.Student;

public interface StudentSearchService {

    Student findStudent(String firstName, String secondName);
}
