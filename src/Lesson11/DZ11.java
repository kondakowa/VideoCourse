
package Lesson11;

public class DZ11 {
    String color;
    String engine;
    int doors;

     DZ11(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}
 class CarTest {

    void changeDoors(DZ11 car, int newDoors) {
        car.doors = newDoors;
    }

    void swapColors(DZ11 c1, DZ11 c2) {
        String temp = c1.color;
        c1.color = c2.color;
        c2.color = temp;
    }

    public static void main(String[] args) {

        CarTest test = new CarTest();

        DZ11 car1 = new DZ11("Red", "V6", 2);
        DZ11 car2 = new DZ11("Green", "V8", 4);

        System.out.println("      ДО ИЗМЕНЕНИЙ");
        System.out.println("           CAR1");
        System.out.println("COLOR: " + car1.color + "   ENGINE: " + car1.engine + "   DOORS: " + car1.doors);
        System.out.println("           CAR2");       
        System.out.println("COLOR: " + car2.color + " ENGINE: " + car2.engine + "   DOORS: " + car2.doors);

        test.changeDoors(car1, 5);
        test.swapColors(car1, car2);

        System.out.println(" ");
        System.out.println("      ПОСЛЕ ИЗМЕНЕНИЙ");
        System.out.println("           CAR1");
        System.out.println("COLOR: " + car1.color + "   ENGINE: " + car1.engine + " DOORS: " + car1.doors);
        System.out.println("           CAR2");       
        System.out.println("COLOR: " + car2.color + "     ENGINE: " + car2.engine + " DOORS: " + car2.doors);
    }
}



