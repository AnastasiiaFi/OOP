package HW5.service;


import HW5.data.StudentGroup;
import HW5.data.Teacher;
import HW5.data.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentGroupService {
    private List<StudentGroup> groups ;

    public StudentGroupService() {
        this.groups = new ArrayList<StudentGroup>();
    }

    public void createGroup(Teacher teacher, List<Student> students){
        this.groups.add(new StudentGroup(teacher, students));
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

}