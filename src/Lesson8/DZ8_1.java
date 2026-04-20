//      Задание 1
//В первом классе создайте 2 static метода.
//1‑ый пусть умножает 3 числа из параметра метода и возвращает их произведение.
//2‑ой — делит первое число из параметра на второе и ничего не возвращает, 
//лишь выводит на дисплей в читабельном виде целое частное и остаток.
//Во втором классе по два раза используйте данные методы.

package Lesson8;
public class Main {

    public static int ymnojenie(int a, int b, int c) {
        return a * b * c;
    }
    public static void delenie(int a, int b){

        int c = a / b;
        int t = a % b;
        
        System.out.println("Результат деления: " + a + "/"+b+"="+c + " отстаток: "+t);
        
    }

    public static void main(String[] args) {

        System.out.println("Результат умножения: " + ymnojenie(1, 2, 3));
        System.out.println("Результат умножения: " + ymnojenie(4, 5, 6));
        delenie(20,6);
        delenie(20, 4);
    }
}