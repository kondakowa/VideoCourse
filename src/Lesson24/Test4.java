package Lesson24;

public class Test4 {

    Jumpable j1 = new Human();
    Jumpable j2 = new Animal();
}

class Human implements Jumpable {

    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements Jumpable {

    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface Jumpable {

    void jump();

}
