package HW3;

import java.util.Comparator;
import java.util.List;

public class FlowService {
    private StreamComparator comparator;
    public FlowService(StreamComparator comparator) {
        this.comparator = comparator;
    }
    public void Sort(List<Flow> flows){
       Log(flows);
        flows.sort(this.comparator);
        Log(flows);
    }


    private void Log(List<Flow> flows) {

        for (var flow: flows) {
            System.out.println(flow.getName() + " содержит " + flow.getQuantityGroup() + " групп");
        }
    }
}
