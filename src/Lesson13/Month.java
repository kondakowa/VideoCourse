/*«1. В классе Month создайте метод, у которого 1 параметр типа данных int.
Этот параметр будет указывать порядковый номер месяца.
Используя функционал switch, выведите на экран количество дней этого 
месяца (для 2015 года).
package Lesson13;*/

public class Month {

         public static void month(int numberMonth) {
            
          switch(numberMonth){
            
            case 1: System.out.println("В январе 2015 года 31 день");    
            break;
            case 2: System.out.println("В феврале 2015 года 28 дней");    
            break;
            case 3: System.out.println("В марте 2015 года 31 день");    
            break;
            case 4: System.out.println("В апреле 2015 года 30 дней");    
            break;
            case 5: System.out.println("В мае 2015 года 31 день");    
            break;
            case 6: System.out.println("В июне 2015 года 30 дней");    
            break;
            case 7: System.out.println("В июле 2015 года 31 день");    
            break;
            case 8: System.out.println("В августе 2015 года 31 день");    
            break;
            case 9: System.out.println("В сентябре 2015 года 30 дней");    
            break;
            case 10: System.out.println("В октябре 2015 года 31 день");    
            break;
            case 11: System.out.println("В ноябре 2015 года 30 дней");    
            break;
            case 12: System.out.println("В декабре 2015 года 31 день");    
            break;
            default:
            System.out.println("Такого месяца не существует");
      }
    
}

 public static void main(String[] args) {
        month(12); 
        month(1); 
    }
}
