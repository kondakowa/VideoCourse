//Пересоздайте класс Employee таким образом, чтобы: 
//переменная salary была недоступна вне класса, 
//переменная surname была доступна отовсюду, 
//переменная id — только внутри пакета. 
//Также создайте 3 public метода, которые будут показывать на дисплее 
//значения этих переменных. 
//Создайте для данного класса 3 разных конструктора с public, default и 
//private access modifier-ами. 
//В конструкторах присваивайте переменным класса значения из параметров. 
//Создайте новые классы в том же и в другом пакете. 
//Попытайтесь в них создать объекты класса Employee и вывести на экран 
//значения переменных данного объекта с помощью метода println и методов 
//самого класса.

package Lesson7;

public class DZ7_Employee {

    int id;                 
    public String surname;  
    private double salary;  
    
    public void printId() {
        System.out.println("ID: " + id);
    }
    public void printSurname() {
        System.out.println("Surname: " + surname);
    }
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public DZ7_Employee(int id, String surname, double salary) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }

    DZ7_Employee(String surname, double salary) {
        this.id = 0;
        this.surname = surname;
        this.salary = salary;
    }

    private DZ7_Employee(int id) {
        this.id = id;
        this.surname = "chikchirik";
        this.salary = 0.0;
    }

    public static void main(String[] args) {
        DZ7_Employee emp1 = new DZ7_Employee(1, "Kondakova", 28.0);

        System.out.println(emp1.id);   
        System.out.println(emp1.surname);   

        emp1.printId();
        emp1.printSurname();
        emp1.printSalary();

        DZ7_Employee emp2 = new DZ7_Employee("Lazarev", 29.0);
        emp2.printId();
        emp2.printSurname();
        emp2.printSalary();

        DZ7_Employee emp3 = new DZ7_Employee(3);
        emp3.printId();
        emp3.printSurname();
        emp3.printSalary();
    }
}