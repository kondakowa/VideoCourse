/*package Lesson25;

public class Test1 {

    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

        Employee[] array2 = {emp1, emp2, emp3};

        /*   Help_able h = new Teacher();
        emp1.work();//в зависимости от  типа объекта, который вызывает метод ворк, этот ворк будет работать по разному, это и есть полиморфизм
        //полиморфизм также есть там где нет abstract, можон также использовать с интерфейсами
        emp2.work();
        emp3.work();
     
     for(Employee emp:array2){
     emp.work();*/
    /*    //   }
        System.out.println(emp1 instanceof Teacher);
    }
}

abstract class Employee {

    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {

    public void help() {
        System.out.println("Teacher helps");
    }

    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able {

    public void help() {
        System.out.println("Driver helps");
    }

    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements Help_able {

    public void help() {
        System.out.println("Doctor helps");
    }

    void work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {

    void help();

}*/
