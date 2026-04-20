/*
Создайте класс, в котором создайте метод abc.
Инпут‑параметром данного метода будет N‑ое количество параметров типа String.
Метод должен возвращать отсортированный объект ArrayList из неповторяющихся 
объектов типа String, взятых из параметров метода, и выводить данный объект на экран.
Продемонстрируйте данный метод.
 */
package Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class DZ20 {

    public static void main(String[] args) {
        ArrayList<String> result = abc("B", "A", "O", "A", "D", "B", "A", "X", "B");
        System.out.println(result);
    }

    public static ArrayList<String> abc(String... strings) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }

        Collections.sort(list);
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        return list;
    }
}
