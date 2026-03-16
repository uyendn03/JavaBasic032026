package Bai1_Collection;

import java.util.HashSet;
import java.util.Set;

public class DemoCollectionSet {

    public static void main(String[] args) {
        Set<String> listSession = new HashSet<>();

        listSession.add("8145829693275");
        listSession.add("jhsdgjsyg756959");
        listSession.add("atbdib86469");

        listSession.remove("atbdib86469");

        System.out.println(listSession.contains("8145829693275")); //true
        System.out.println(listSession.contains("7295682")); //false

        for (String session : listSession) {
            System.out.println(session);
        }
    }
}
