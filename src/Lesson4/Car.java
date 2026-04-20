package Lesson4;

public class Car {
    String color="red";
    String engine="V6";
}

class CarTest{
public static void main (String[] args) {
int a;
Car car1 = new Car ();
car1.color="black";
car1.engine = "V8";
System.out.println(car1.color);
System.out.println(car1.engine);



}
}



