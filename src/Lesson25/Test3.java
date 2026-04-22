/*package Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
       // Doctor d1 = (Doctor)emp1; //компилятор, верь мне
       h.help();
        System.out.println(((Doctor)h).specializaciya);
      ((Doctor)h).lechit();
        
    }
}
    class Employee extends java.lang.Object {
        double salary = 100;
        String name = "Kolya";
        int age;
        int experience;

        void eat() { System.out.println("Kushat"); }
        void sleep() { System.out.println("Spat"); }
    }

    class Doctor extends Employee implements Help_able{
        String specializaciya="xirurg";
        public void help(){System.out.println("Doctor okazivaet pomosh");}
        void lechit() { System.out.println("Lechit"); }
    }

    class Teacher extends Employee {
        int kolichestvoUchenikov;
        void uchit() { System.out.println("Uchit"); }
    }

    class Driver extends Employee {
        String nazvanieMashini;
        void vodit() { System.out.println("Vodit"); }
    }

interface Help_able {

    void help();

}