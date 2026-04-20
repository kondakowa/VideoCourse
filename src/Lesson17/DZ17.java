/*
Создайте класс, в котором создайте метод ravenstvo.  
Инпут‑параметрами данного метода будут 2 объекта класса StringBuilder.
Метод должен иметь boolean return type, возвращать true, если значения объектов 
совпадают, false – если не совпадают.
Продемонстрируйте данный метод.
 */
package Lesson17;

public class DZ17 {

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean a = true;

        if (sb1.length() == sb2.length()) {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    a = false;
                    break;
                }
            }
        } else {
            a = false;
        }

        return a;
    }
}

class DZ17RavenstvoTest {

    public static void main(String[] args) {

        StringBuilder sb3 = new StringBuilder("Stepa");
        StringBuilder sb4 = new StringBuilder("KoshkaStepa");
        StringBuilder sb5 = new StringBuilder("Stepa");
        StringBuilder sb6 = new StringBuilder("stepa");

        System.out.println("sb3 = " + sb3 + ", sb4 = " + sb4);
        System.out.println("ravenstvo = " + DZ17.ravenstvo(sb3, sb4));
        System.out.println();
        System.out.println("sb4 = " + sb4 + ", sb5 = " + sb5);
        System.out.println("ravenstvo = " + DZ17.ravenstvo(sb4, sb5));
        System.out.println();
        System.out.println("sb5 = " + sb5 + ", sb6 = " + sb6);
        System.out.println("ravenstvo = " + DZ17.ravenstvo(sb5, sb6));
        System.out.println();
        System.out.println("sb6 = " + sb6 + ", sb3 = " + sb3);
        System.out.println("ravenstvo = " + DZ17.ravenstvo(sb6, sb3));
        System.out.println();
        System.out.println("sb5 = " + sb5 + ", sb3 = " + sb3);
        System.out.println("ravenstvo = " + DZ17.ravenstvo(sb5, sb3));
    }
}
