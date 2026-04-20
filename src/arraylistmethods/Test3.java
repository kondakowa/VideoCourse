package arraylistmethods;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mikhail");
        map.put(778, "Tregulov Zaur");
        map.put(779, "Sidorova Mariya");
        map.put(780, "Petrov Petr");
        map.put(779, "Roberto Carlos");
        map.put(781, "Tregulov Zaur");
        map.remove(779);
        System.out.println("map = " + map);
    }
}
