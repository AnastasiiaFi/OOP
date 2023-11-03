package HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups = new ArrayList<>();
    private String name;

    public Flow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addStudentGroup(StudentGroup group){
        studentGroups.add(group);
    }
    public Iterator<StudentGroup> iterator(){
        return studentGroups.iterator();
    }
    public int getQuantityGroup(){
        return studentGroups.size();
    }


}
