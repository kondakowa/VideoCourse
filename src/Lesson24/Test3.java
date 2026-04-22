package Lesson24;

public class Test3 {
}

class Employee {

    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher extends Employee implements Help_able {

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    public void tushiPojar() {
        System.out.println("Uchitel tushit pojar");
    }

}

class Driver extends Employee implements Help_able, Swim_able {

    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }

    public void pomosh() {
        System.out.println("Voditel okazivaet pomosh");
    }

    public void tushiPojar() {
        System.out.println("Voditel tushit pojar");
    }

    public void swim() {
        System.out.println("Voditel mojet plavat");
    }
}

interface Help_able { //сам понимает что метод abstract & public
    //не может быть final

    void pomosh();

    void tushiPojar();
}

interface Swim_able {

    void swim();
}
