//      ЗАДАНИЕ 2_1
// Вычислите устно output‑ы данных программ, а затем проверьте в NetBeans:
// class Test1 {
//  int a = 1;
//  static int a = 2;
//
//  void abc(int a) {
//    System.out.println(a);
//    System.out.println(this.a);
//  }
//
//  public static void main(String[] args) {
//    DZ8_2 t = new DZ8_2();
//    t.abc(3);
//  }
// }
//
//      ВЫЧИСЛЕНИЕ
// a - объявлена как int и как static  - думаю, это будет ошибкой. 
// Ничего не выведется.

package Lesson9;

public class DZ8_2 {
  int a=1;
 // static int a=2;
  void abc(int a){
    System.out.println(a);
    System.out.println(this.a);
  }
  public static void main(String [] args){
    DZ8_2 t = new DZ8_2();
    t.abc(3);
  }
}
// Выводит ошибку 