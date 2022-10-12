package Service.impl;

import java.util.List;
import java.util.logging.Logger;

import Data.impl.Notebook;
import Service.Printable;

public class NotebookPrintService implements Printable<Notebook> {

    @Override
    public void printLogs(List<Notebook> computerList) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info("Notebooks:" + computerList.toString());
    }
}
