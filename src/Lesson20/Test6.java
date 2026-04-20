package Lesson20;

import java.util.ArrayList;

public class Test6 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("S");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb3);
        list1.add(sb3);
        ArrayList<StringBuilder> list3 = list1;
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
     //   System.out.println(list1.get(0) == list2.get(0));
        list2.get(0).append("!!!");
        list1.set(0, new StringBuilder("D") );
        System.out.println(list2.get(0));
    }
}
