package Lesson7;

public class Employee {
     double salary;
    
     void dvoynayaZP(){
         double result = salary*2;
    System.out.println("Novaya z/p= "+result);
    }
     Employee(double salary2){
    salary=salary2;
    }
    public static main (String[] args){
    Employee emp = new Employee(500);
    System.out.println(emp.salary);