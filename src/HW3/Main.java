package HW3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Flow> getArray(){
        List<Flow> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество потоков");
        int flowsCount = scanner.nextInt();


        for (int i = 0; i < flowsCount; i++) {
            list.add(new Flow("Поток №" + (i+1)));
        }

        for (Flow flow : list) {
            System.out.println("Введите количество групп в потоке '" + flow.getName()  +"'");
            int groupsCount = scanner.nextInt();
            for (int i = 0; i < groupsCount; i++) {
                flow.addStudentGroup(new StudentGroup("Группа № " + (i+1)));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        StreamComparator comparator = new StreamComparator();
        FlowService service = new FlowService(comparator);
        var list = getArray();
        service.Sort(list);
    }
}