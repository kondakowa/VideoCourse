/*package Lesson25;

public class Test2 {

    public static void main(String[] args) {
        Jupmable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jupmable) {
            System.out.println("j is Jupmable");
        }
        if (m instanceof Human) {
            System.out.println("m is Human");
        }
      //  if (s instanceof Human) {
     //       System.out.println("s is Human");
     //   }

    }

}

interface Jupmable {
}

class Human implements Jupmable {
}

class Man extends Human {
}

class Student {
}
