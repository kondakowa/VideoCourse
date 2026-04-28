/*package Lesson27;

public class Test5 {

    static void abc() {
        System.out.println("rabotaet method abc");
        abc();

    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError e) {
            System.out.println("error poyman");
        }
    }
}
//рекурсия
//не обрабатывать ерроры