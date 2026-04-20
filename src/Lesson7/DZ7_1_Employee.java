package Lesson7;

public class DZ7_1_Employee {
    public static void main(String[] args) {

        DZ7_Employee emp1 = new DZ7_Employee(3, "Stepanov", 22.0);
        DZ7_Employee emp2 = new DZ7_Employee("Kondakowa", 24.0);

        System.out.println(emp1.id);        
        System.out.println(emp1.surname);   
        emp1.printSalary();
    }
}

