import java.util.ArrayList;
import java.util.List;

import Controller.ComputerController;
import Data.impl.Desktop;
import Data.impl.Notebook;

public class Main {
    public static void main(String[] args) {
        List<Notebook> initNotebookData = new ArrayList<Notebook>();
        initNotebookData.add(new Notebook("7", "hp", "black", 1200));
        initNotebookData.add(new Notebook("2", "msi", "white", 1500));
        initNotebookData.add(new Notebook("3", "xiaomi", "black", 1200));
        initNotebookData.add(new Notebook("4", "hp", "grey", 1000));
        initNotebookData.add(new Notebook("5", "asus", "grey", 1200));

        List<Desktop> initDesktopData = new ArrayList<Desktop>();
        initDesktopData.add(new Desktop("11", "hp", "black", 150));
        initDesktopData.add(new Desktop("7", "msi", "white", 200));
        initDesktopData.add(new Desktop("8", "xiaomi", "black", 150));
        initDesktopData.add(new Desktop("9", "hp", "grey", 120));
        initDesktopData.add(new Desktop("10", "asus", "grey", 150));

        ComputerController controller = new ComputerController();
        controller.startButton(initNotebookData, initDesktopData);
    }
}
