package Lesson22;

public class Test3 {


    static public void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.specializaciya = "xirurg";
        doc.sleep();
        doc.lechit();
    }
}
//наследование

class Employee {// суперкласс

    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}


// тут не применяется никакое наследование

class Doctor extends Employee { //сабкласс Employee
//String name;
//int age;
//int experience;

    String specializaciya;
//void eat(){System.out.println("Kushat");}
//void sleep (){System.out.println("Spat");}

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {//сабкласс Employee
//String name;
//int age;
//int experience;

    int kolichectvoUchenikov;
//void eat(){System.out.println("Kushat");}
//void sleep (){System.out.println("Spat");}

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {//сабкласс Employee

    String name;
    int age;
    int experience;
    String nazvanieMashini;
//void eat(){System.out.println("Kushat");}
//void sleep (){System.out.println("Spat");}

    void vodit() {
        System.out.println("Vodit");
    }
}
