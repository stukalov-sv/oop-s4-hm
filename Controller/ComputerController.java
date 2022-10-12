package Controller;
import java.util.List;
import java.util.Scanner;

import Data.impl.Desktop;
import Data.impl.Notebook;
import Service.impl.DesktopFilterService;
import Service.impl.DesktopPrintService;
import Service.impl.DesktopSortingService;
import Service.impl.NotebookFilterService;
import Service.impl.NotebookPrintService;
import Service.impl.NotebookSortingService;

public class ComputerController {
    
    private NotebookSortingService notebookSortingService;
    private DesktopSortingService desktopSortingService;
    private NotebookPrintService notebookPrintService;
    private DesktopPrintService desktopPrintService;
    private NotebookFilterService notebookFilterService;
    private DesktopFilterService desktopFilterService;
    
    public ComputerController() {
        this.notebookSortingService = new NotebookSortingService();
        this.desktopSortingService = new DesktopSortingService();
        this.notebookPrintService = new NotebookPrintService();
        this.desktopPrintService = new DesktopPrintService();
        this.notebookFilterService = new NotebookFilterService();
        this.desktopFilterService = new DesktopFilterService();
    }

    public void startButton(List<Notebook> notebookList, List<Desktop> desktopList) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\nChoose action:\n" +
            "1 - get notebooks base info\n" +
            "2 - get desktops base info\n" +
            "3 - get sorted notebook base info\n" +
            "4 - get sorted desktop base info\n" +
            "5 - get filtered notebook base info\n" +
            "6 - get filtered desktop base info\n");

        int action = iScanner.nextInt();

        switch (action) {
            case 1:
                notebookPrintService.printLogs(notebookList);
                break;
            case 2:
                desktopPrintService.printLogs(desktopList);
                break;
            case 3:
                notebookPrintService.printLogs(notebookSortingService.getSorted(notebookList));
                break;
            case 4:
                desktopPrintService.printLogs(desktopSortingService.getSorted(desktopList));
                break;
            case 5:
                String[] notebookFilter = notebookFilterService.getFilterData();
                List<Notebook> resultNotebook = notebookFilterService.getFilterList(notebookList, notebookFilter[0], notebookFilter[1]);
                notebookPrintService.printLogs(resultNotebook);
                break;
            case 6:
                String[] desktopFilter = desktopFilterService.getFilterData();
                List<Desktop> resultDesktop = desktopFilterService.getFilterList(desktopList, desktopFilter[0], desktopFilter[1]);
                desktopPrintService.printLogs(resultDesktop);
                break;
            default:
                System.out.println("Incorrect data");
                break;
        }
        iScanner.close();
    }
}
