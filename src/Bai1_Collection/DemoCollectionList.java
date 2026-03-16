package Bai1_Collection;

import java.util.List;

public class DemoCollectionList {
    public static void main(String[] args) {
        List<String> listMenu = new java.util.ArrayList<>();

        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Tasks");

        listMenu.remove(1);

        System.out.println(listMenu.size());

        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i));
        }

    }
}
