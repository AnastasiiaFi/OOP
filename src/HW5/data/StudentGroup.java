package HW5.data;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudentGroup(HW5.data.Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public HW5.data.Teacher getTeacher(){
        return teacher;
    }
    public List<Student> getStudents(){
        return students;
    }
    public void addTeacher(HW5.data.Teacher teacher){
        this.teacher = teacher;
    }
    public void addStudents(List<Student> students){
        this.students.addAll(students);
    }
    @Override
    public String toString() {
        return "УчебнаяГруппа{\n" +
                "teacher=" + teacher + "\n" +
                ", students=" + students +
                '}';
    }

}