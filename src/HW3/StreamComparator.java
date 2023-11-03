package HW3;

import java.util.Comparator;

public class StreamComparator implements Comparator <Flow> {
    @Override
    public int compare(Flow o1, Flow o2 ) {
        int quantityGroup1 = o1.getQuantityGroup();
        int quantityGroup2 = o2.getQuantityGroup();

        return Integer.compare(quantityGroup1, quantityGroup2);
    }
}
