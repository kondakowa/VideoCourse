/*Создайте класс Animal. При вызове его конструктора пусть на экран выводится 
"I am animal". В классе пусть будет переменная eyes, характеризующая количество 
глаз; методы eat (выводящий на экран "Animal eats") и drink (выводящий на экран 
"Animal drinks").
Создайте класс Pet, который является child классом класса Animal. При вызове его
конструктора пусть на экран выводится "I am pet" и переменной eyes придаётся значение
2. В классе пусть будут переменные name; tail, характеризующая количество хвостов и 
равна 1; paw, характеризующая количество лап и равна 4; методы run (выводящий на 
экран "Pet runs") и jump (выводящий на экран "Pet jumps").
Создайте класс Dog, который является child классом класса Pet. При вызове его 
конструктора с параметром, который будет передавать имя, пусть на экран выводится
"I am dog and my name is: " + имя питомца. В класс добавьте метод play (выводящий 
на экран "Dog plays").
Создайте класс Cat, который является child классом класса Pet. При вызове его 
конструктора с параметром, который будет передавать имя, пусть на экран выводится
"I am cat and my name is: " + имя питомца. В класс добавьте метод sleep (выводящий на 
экран "Cat sleeps").
Создайте класс Test, в методе main которого выведите на экран количество лап 
объекта класса Dog и вызовите метод sleep объекта класса Cat.*/

package Lesson22;

public class DZ22_2 {

    int eyes;

    DZ22_2() {
        System.out.println("I am animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends DZ22_2 {

    String name;
    int tail = 1;
    int paw = 4;

    Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {

    Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is: " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is: " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test5 {

    public static void main(String[] args) {

        Dog dog = new Dog("Григорий");
        System.out.println("Количество лап у собаки: " + dog.paw);

        Cat cat = new Cat("Степан");
        cat.sleep();
    }
}
