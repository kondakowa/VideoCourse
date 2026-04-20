/*    ЗАДАНИЕ

Создать класс.
В классе создать статичный метод, который будет выводить на экран время в 
формате «час:минута:секунда» в интервале от 0 до 6 часов.
Если час больше единицы и минута кратна 10-ти, то метод нужно закончить.
Если же (секунда, умноженная на час) больше минуты, то пора переходить на 
другую минуту. Продемонстрировать данный метод в действии.*/


package Lesson14;


public class DZ14 {
                  
static void watch() {
    
        for (int hour = 0; hour <= 6; hour++) 
        {
            for (int min = 0; min < 60; min++) 
            {
                if (hour > 1 && min % 10 == 0)                
                {           
                break;                 
                }
                               
                     
                for (int sec = 0; sec < 60; sec++) 
                {
                    if (sec * hour > min) 
                    {
                        int a = sec * hour;
                        System.out.println("sec * hour = " + a + " > " + min + " -> переход на следующую минуту");                        
                        continue;                      
                    }
                System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }
    
    public static void main(String[] args){
    watch();
                 }
              }
