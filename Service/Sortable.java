package Service;

import java.util.List;

import Data.Computer;

public interface Sortable<T extends Computer> {
    public List<T> getSorted(List<T> computerList);
}
