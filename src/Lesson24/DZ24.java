package Lesson24;

public class DZ24 {

    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Karl");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();

        Speakable s1 = new Pingvin("Kovalski");
        s1.speak();

        Animal a = new Lev("Leva1");
        System.out.println(a.name);
        a.eat();
        a.sleep();

        Mammal mam = new Lev("Leva2");
        System.out.println(mam.name);
        mam.eat();
        mam.sleep();
        mam.run();
        mam.speak();
    }

}

abstract class Animal {

    Animal(String name) {
        this.name = name;
    }

    String name;

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec ne khishchnaya riba, i ona est obychnyi ribiy korm!");
    }
}

class Pingvin extends Bird {

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Pingvini lyubyat est ribu!");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvini spyat, prijavshis drug k drugu!");
    }

    @Override
    public void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi!");
    }
}

class Lev extends Mammal {

    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lev, kak lyuboy khishchnik, lyubit myaso!");
    }

    @Override
    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

    @Override
    public void run() {
        System.out.println("Lev — eto ne samaya bystraya koshka!");
    }
}
