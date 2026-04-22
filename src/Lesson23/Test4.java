/*package Lesson23;

public class Test4 {

    void abc(Animal a) {
        System.out.println("A");
    }//overloade

    void abc(Mouse M) {
        System.out.println("M");
    }//overloade

    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal an = new Mouse();
        t.abc(an);
    }
}

class Animal {

    void getName() {
        System.out.println("Animal");
    }

}

class Mouse extends Animal {

    void getName() {
        System.out.println("Mouse");
    }
}
