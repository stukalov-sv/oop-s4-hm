package Service.impl;

import java.util.Collections;
import java.util.List;

import Data.impl.Desktop;
import Service.ComputerComparator;
import Service.Sortable;

public class DesktopSortingService implements Sortable<Desktop> {

    @Override
    public List<Desktop> getSorted(List<Desktop> computerList) {
        Collections.sort(computerList, new ComputerComparator());
        return computerList;
    }
    
}
