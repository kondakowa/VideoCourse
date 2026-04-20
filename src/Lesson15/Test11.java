
package Lesson15;


public class Test11 {
    
     public static void main (String[] argas){
    int i = 0;

while (i < 5) {
    i++;

    if (i == 2) {
        continue;
    }

    System.out.println("В цикле: " + i);                    
}

System.out.println("После цикла");
}
}
