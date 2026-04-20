//В первом классе создайте static final переменную Пи = 3,14.
//Используйте данную константу в non‑static методе, который принимает в 
//параметре значение радиуса и вычисляет площадь круга по формуле:
//Площадь = Пи * радиус * радиус.
//Также используйте данную константу в static методе, который принимает 
//в параметре значение радиуса и вычисляет длину окружности по формуле:
//Длина = 2 * Пи * радиус.
//Создайте ещё один non‑static метод, который принимает в параметре значение 
//радиуса и выводит на экран информацию о радиусе, площади круга и длине 
//окружности.
//Используйте все 3 метода во 2‑м классе.

package Lesson8;

public class DZ8_2 {

    public static final double PI = 3.14;
    
    public double circleArea(double R) {
        return PI * R * R;
    }

    public static double circleCircle(double R) {
        return 2 * PI * R;
    }

    public void printInfo(double R) {
        double area = circleArea(R);
        double circumference = circleCircle(R);

        System.out.println("Радиус: " + R);
        System.out.println("Площадь круга: " + area);
        System.out.println("Длина окружности: " + circumference);
    }

    public static void main(String[] args) {

        DZ8_2 obj = new DZ8_2();

        System.out.println("Площадь: " + obj.circleArea(5));
        System.out.println("Длина окружности: " + circleCircle(5));
        obj.printInfo(3);
    }
}

