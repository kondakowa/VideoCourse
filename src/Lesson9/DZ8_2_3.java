//      ЗАДАНИЕ 2_3
// class DZ8_2_3{
//   int a=1;
//   static int b=2;
//   void abc(int a){
//     System.out.println(b);
//     System.out.println(a);
//     System.out.println(this.a);
//     System.out.println(DZ8_2_3.b);
//   }
//   public static void main(String [] args){
//     DZ8_2_3 t = new DZ8_2_3();
//     t.abc(4);
//   }
// }
//      ВЫЧИСЛЕНИЕ
// a=1. static b=2. Параметр a внутри  public static void main(String [] args) 
// равен 4

package Lesson9;

class DZ8_2_3{
  int a=1;
  static int b=2;
  void abc(int a){
    System.out.println(b); // статическое поле выводит 2
    System.out.println(a); // выводит 4 из main
    System.out.println(this.a); // поле объекта выводит 1
    System.out.println(DZ8_2_3.b); //  статическое поле выводит 2
  }
  public static void main(String [] args){
    DZ8_2_3 t = new DZ8_2_3();
    t.abc(4);
  }
}

