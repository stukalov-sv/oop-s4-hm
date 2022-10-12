package Service.impl;

import java.util.List;

import Data.impl.Desktop;
import Service.Printable;
import java.util.logging.Logger;

public class DesktopPrintService implements Printable<Desktop> {

    @Override
    public void printLogs(List<Desktop> computerList) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info("Desktops:" + computerList.toString());
    }
    
}
