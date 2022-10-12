package Service;

import java.util.List;

import Data.Computer;

public interface Printable<T extends Computer> {
    public void printLogs(List<T> computerList);
}
