package Service.impl;

import java.util.Collections;
import java.util.List;

import Data.impl.Notebook;
import Service.ComputerComparator;
import Service.Sortable;

public class NotebookSortingService implements Sortable<Notebook>{

    @Override
    public List<Notebook> getSorted(List<Notebook> computerList) {
        Collections.sort(computerList, new ComputerComparator());
        return computerList;
    }
    
}
