package Lesson7_1;

import Lesson7.DZ7_Employee;

public class DZ7_1_EmployeeDrygoyClass {
    public static void main(String[] args) {

        DZ7_Employee emp = new DZ7_Employee(1, "Kondakova", 28.0);

        System.out.println(emp.surname); 

        emp.printId();       
        emp.printSurname(); 
        emp.printSalary();   
    }
}
