/*package Lesson26;

public class Test5 {

    {
        System.out.println("Eto init block 3");
    }

    Test5() {
        System.out.println("Eto konstruktor 1");
    }

    Test5(int a) {
        this();
        System.out.println("Eto konstruktor 2");
    }

    {
        System.out.println("Eto init block 1");
    }

    static {
        System.out.println("Eto STATIC init block 1");
    }

    {
        System.out.println("Eto init block 2");
    }

    static {
        System.out.println("Eto STATIC init block 2");
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t5 = new Test5(3);

    }
}
