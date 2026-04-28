/*
import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        Car c4 = new Car("black", "V8");

        System.out.println(list.contains(c4));
    }
}

class Car {

    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car c = (Car) o;
            return (color.equals(c.color) && engine.equals(c.engine));
        } else {
            return false;
        }
    }
}
