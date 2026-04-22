package Lesson23;

public class Test5 {

    public static void main(String[] args) {
        Employee emp = new Employee();

        Teacher t = new Teacher();

        t.sleep();
        Employee e = new Teacher();
        //e.sleep(); private
    }
}

class Eda {
}

class Frukti extends Eda {
}

class Employee {

    double salary = 100;
    String name = "Kolya";

    public Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    private void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Teacher extends Employee {

    public Eda eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    public void sleep() {
        System.out.println("Spit uchitel");
    }
}
