package Service.impl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

import Data.impl.Notebook;
import Service.Filterable;

public class NotebookFilterService implements Filterable<Notebook> {

    @Override
    public String[] getFilterData() {
        Scanner iScanner = new Scanner(System.in);
        String[] res = new String[2];

        System.out.println("\nChoose filter parameter:\n" +
                "1 - serial number\n" +
                "2 - name of producer\n" +
                "3 - color\n" +
                "4 - battery capacity\n");
        res[0] = iScanner.nextLine();

        System.out.println("\nEnter filter value:");
        res[1] = iScanner.nextLine();
        iScanner.close();
        return res;
    }

    @Override
    public List<Notebook> getFilterList(List<Notebook> arrayList, String filterCase, String filterWord) {
        LinkedHashSet<Notebook> temp = new LinkedHashSet<>();
        switch (filterCase) {
            case "1":
                for (var item : arrayList) {
                    if (item.getSn().equals(filterWord)) {
                        temp.add(item);
                    }
                }
                break;
            case "2":
                for (var item : arrayList) {
                    if (item.getProducer().equals(filterWord)) {
                        temp.add(item);
                    }
                }
                break;
            case "3":
                for (var item : arrayList) {
                    if (item.getColor().equals(filterWord)) {
                        temp.add(item);
                    }
                }
                break;
            case "4":
                for (var item : arrayList) {
                    if (item.getBatteryCapacity().toString().equals(filterWord)) {
                        temp.add(item);
                    }
                }
                break;
            default:
                break;

        }

        List<Notebook> res = new ArrayList<Notebook>();
        res.addAll(temp);
        return res;
    }

}
