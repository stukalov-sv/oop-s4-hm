package Service;
import java.util.Comparator;

import Data.Computer;

public class ComputerComparator implements Comparator<Computer>{

    @Override
    public int compare(Computer item1, Computer item2) {
        if (Integer.valueOf(item1.getSn()) > Integer.valueOf(item2.getSn())) {
            return 1;
        } else if (Integer.valueOf(item1.getSn()) < Integer.valueOf(item2.getSn())) {
            return -1;
        } else {
        return 0;
        }
    }
}
