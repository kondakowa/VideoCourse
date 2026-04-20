//      ЗАДАНИЕ 2_2
// Вычислите устно output‑ы данных программ, а затем проверьте в NetBeans:
// class Test2{
//   int a=1;
//   static int b=2;
//   static void abc(final int a){
//     System.out.println(a);
//     System.out.println(DZ8_2_2.b);
//   }
//   public static void main(String [] args){
//     abc(5);
//   }
// }
//
//      ВЫЧИСЛЕНИЕ
//  a=1, далее метод static void abc(final int a), a - не static, метод 
//  не может работать с не static a без ссылки на объект, при выводе 
//  System.out.println(a); - будет ошибка. В System.out.println(DZ8_2_2.b); 
//  b - static, а также есть ссылка на объект, т.е. выведется 2.  
//  В main вызывается abc(5); a становится 5
//  Выведется: 5 2
package Lesson9;

public class DZ8_2_2 {
     int a=1;
  static int b=2;
  static void abc(int final a){
    System.out.println(a);
    System.out.println(DZ8_2_2.b);
  }
  public static void main(String [] args){
    abc(5);
  }
}

// выводит 
// 5
// 2