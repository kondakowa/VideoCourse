package Lesson3;

public class DZ3 {
       public static void main(String [] args) {
           
 // 1. Вычислите следующую часть кода:
int i1 = 5;
int i2 = 11;
double d1 = 5.5;
double d2 = 1.3;
long l = 20;
double result = 0;
result = i2 / d1 + d2 % i1 - l; 

System.out.println("           Задание 1"); 
System.out.println("Вычислила: " + result);           
           
           
// 2. Чему равны выражения:
// * a-- - --a + ++a + a++ +a; где a=5
// * ++b - b++ + ++b - --b; где b=8
   int a=5;
   int x=a-- - --a + ++a + a++ +a;

   int b=8;
   int y=++b - b++ + ++b - --b;
   
System.out.println("           Задание 2"); 
System.out.println("Выражение a= a-- - --a + ++a + a++ + a; где a=5 равно: " + x);
System.out.println("Выражение y=++b - b++ + ++b - --b; где b=8 равно: " + y)
}
}
