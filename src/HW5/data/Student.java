package HW5.data;

import java.time.LocalDate;

public class Student extends User {
    private Long studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth,Long id) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = id;
    }

    public long getStudentId(){

        return studentId;
    }

    public void setStudentId(Long studentId){
        this.studentId = studentId;

    }
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

}