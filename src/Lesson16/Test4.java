
package Lesson16;

public class Test4 {
    
}

class Employee{
double salary;
boolean isMAnager;
Employee(double salary, boolean isMAnager) {
this.salary = salary;
this.isMAnager = isMAnager;

}

}

class TestEmployee {
public static void main(String[] args) {
Employee emp = new Employee(100.5, true);
System.out.println("On manager? " + emp.isMAnager + " Ego zarplata: " + emp.salary);

}
}