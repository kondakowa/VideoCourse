/*    ЗАДАНИЕ

Переписать домашнее задание из Урока 14 так, чтобы outer и inner циклы 
представляли собой while loop, а middle цикл представлял собой do while loop.*/


package Lesson15;


public class DZ15 {
                  
static void watch() {
    
     int hour = 0;
     
     while (hour <= 6) {
              
         int min = 0;

            do {

                if (hour > 1 && min % 10 == 0) 
                {
                    break;
                }

             int sec = 0;

        while (sec < 60) {

          if (sec * hour > min) {
              int a = sec * hour;
              System.out.println("sec * hour = " + a + " > " + min + " -> переход к следующей минуте");
              sec++;
              continue;
}
    System.out.println(hour + ":" + min + ":" + sec);
    sec++;
}
                min++;

            } while (min < 60);

            hour++;
        }
    }
    
  
       
    
    public static void main(String[] args){
    watch();
                 }
              }

