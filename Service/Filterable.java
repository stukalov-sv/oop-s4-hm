package Service;

import java.util.List;

import Data.Computer;

public interface Filterable<T extends Computer> {
    public String[] getFilterData();
    public List<T> getFilterList(List<T> arrayList, String filterCase, String filterWord);
}
