//         Задание 1
// Создайте класс, в котором будут 5 overloaded методов, которые вычисляют сумму 
// нуля, одного, двух, трёх и четырёх целых чисел соответственно, передают эту 
//сумму в output и выводят её на экран. В случае, когда слагаемые отсутствуют
//(т.е. когда параметров нет), сумма пусть равняется 0.

package Lesson6;

public class MethotOverloading {
    
    void show(){
        int summa = 0;
        System.out.println("Сумма: " + summa);
    }
    void show(int a){
        int summa = a;
        System.out.println("Сумма: " + summa);
    }
    void show(int a, int b){
        int summa = a + b;
        System.out.println("Сумма: " + summa);
    }
    void show(int a, int b, int c){
        int summa = a + b + c;
        System.out.println("Сумма: " + summa);
    }
    void show (int a, int b, int c, int d){
        int summa = a + b + c + d;
        System.out.println("Сумма: " + summa);
    }
}
class MethotOverloadingTest {
public static void main (String[] args){
MethotOverloading mO = new MethotOverloading ();

        mO.show();
        mO.show(4);
        mO.show(4, 6);
        mO.show(6, 2, 3);
        mO.show(4, 8, 1, 2);
}

}
