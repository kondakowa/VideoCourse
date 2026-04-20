//           ЗАДАНИЕ 1
// В класс BankAccount добавьте 2 метода. Первый метод называется 
// popolnenieScheta и увеличивает баланс на сумму, которая указана в параметре 
// этого метода. Второй метод называется snyatieSoScheta и уменьшает 
// баланс на сумму, которая указана в параметре этого метода.

package Lesson5;

public class D25 {

    int id;
    String name;
    double balance;

    // Метод пополнения
    void popolnenieScheta(double summa) {
        balance += summa;
    }

    // Метод снятия
    void snyatieSoScheta(double summa) {
        balance -= summa;
    }

    public static void main(String[] args) {

        D25 myAccount = new D25();

        myAccount.id = 1;
        myAccount.name = "Ksenya";
        myAccount.balance = 12.35;
        
        System.out.println("    Результаты задания 1");     
        System.out.println("Баланс до пополнения: " + myAccount.balance);
        myAccount.popolnenieScheta(10);
        System.out.println("Баланс после пополнения: " + myAccount.balance);
        myAccount.snyatieSoScheta(5);
        System.out.println("Баланс после снятия: " + myAccount.balance);
    }
}

//           ЗАДАНИЕ 2 
//Измените класс StudentTest так, чтобы среднюю арифметическую оценку студента
//выводил на экран метод. Т. е. создайте 1 метод, параметр которого – это 
//объект класса Student, а в теле метода будет вычисляться средняя 
//арифметическая оценка и выводиться на экран.

package Lesson5;

public class Student {

    int id;
    String firstName;
    String lastName;
    int year;
    double avgMatem;
    double avgEconom;
    double avgYozik;
}

class StudentTest {

    // метод для вычисления и вывода средней оценки
    void showAverage(Student st) {
        double avg = (st.avgMatem + st.avgEconom + st.avgYozik) / 3;

        System.out.println("Студент: " + st.firstName + " " + st.lastName);
        System.out.println("Номер билета: " + st.id);
        System.out.println("Год обучения: " + st.year);
        System.out.println("Средняя оценка: " + avg);
        System.out.println();
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.id = 1;
        student1.firstName = "Ksenya";
        student1.lastName = "Kondakova";
        student1.year = 2026;
        student1.avgMatem = 5;
        student1.avgEconom = 4.5;
        student1.avgYozik = 4.2;

        student2.id = 2;
        student2.firstName = "Slava";
        student2.lastName = "Lazarev";
        student2.year = 2026;
        student2.avgMatem = 4.7;
        student2.avgEconom = 4.3;
        student2.avgYozik = 4.1;

        student3.id = 3;
        student3.firstName = "Stepa";
        student3.lastName = "Stepanov";
        student3.year = 2026;
        student3.avgMatem = 3.4;
        student3.avgEconom = 3.2;
        student3.avgYozik = 4.8;

        StudentTest test = new StudentTest();

        test.showAverage(student1);
        test.showAverage(student2);
        test.showAverage(student3);
    }
}
//           ЗАДАНИЕ 3 
//Создайте класс Employee с атрибутами id, surname, age, salary, department, 
//которые должны задаваться в конструкторе. В данном классе также создайте 
//метод увеличения зарплаты вдвое. Создайте второй класс EmployeeTest, в 
//котором создайте 2 объекта класса Employee. Увеличьте зарплату каждому 
//работнику вдвое с помощью метода и выведите на экран значение новой зарплаты.

package Lesson5;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    
    void doubleSalary() {
        salary *= 2;
    }
}

class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Kondakova", 27, 350000, "Tester");
        Employee employee2 = new Employee(2, "Lazarev", 26, 480000, "Developer");

        employee1.doubleSalary();
        employee2.doubleSalary();

        System.out.println("Новая зарплата работника " + employee1.surname + " из департамента Tester: " + employee1.salary);
        System.out.println("Новая зарплата работника " + employee2.surname + " из департамента Tester: " + employee2.salary);
    }
}