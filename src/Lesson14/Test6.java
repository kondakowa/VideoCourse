
package Lesson14;


public class Test6 {
            public void time (){
                
                
                
                OUTER: for (int chas = 0; chas<=23; chas++){
                    System.out.println("Nachalo outer loopa");
                    
                    INNER: for (int minuta = 0; minuta<=59; minuta++){
                     if (minuta == 20) {continue;}
                
                
                System.out.println(chas + ":" + minuta);
                 }
                                
              
                 System.out.println("Konec outer loopa");
                
                
            }
}
public static void main (String[] args){
    Test6 t = new Test6 ();
    t.time();
    
    
    
    
}}