package Bai1_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> listMenu = new ArrayList<>();
        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Sales");
        listMenu.add("Contracts");
        listMenu.add("Subscriptions");
        listMenu.add("Expenses");
        listMenu.add("Contracts");

        listMenu.remove(2);
        listMenu.add(2, "Projects");

        System.out.println("Check value: " + listMenu.contains("Contracts123"));

        System.out.println(listMenu.indexOf("Contracts")); //Tìm vị trí tại kết quả đầu tiên
        System.out.println(listMenu.lastIndexOf("Contracts")); //Tìm vị trí tại kết quả sau cùng

        System.out.println("*****************************");
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i));
            //break; //Thoát khỏi vòng lặp
        }

        //Convert ArrayList to Array
        System.out.println("+++++++++++++++++++++++++++++++++");
        Object mangMenu[] = listMenu.toArray();

        for (Object item : mangMenu){
            System.out.println(item);
        }

        //Convert Array to ArrayList
        System.out.println("---------------------------------");
        List<Object> listConverted = new ArrayList<>();
        listConverted = Arrays.asList(mangMenu);
        for (Object item : listConverted){
            System.out.println(item);
        }

    }
}
