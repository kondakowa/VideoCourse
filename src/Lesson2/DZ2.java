public class DZ2 {
    public static void main(String[] args) {
//        ЗАДАНИЕ 1
//  Создать по 4 переменные всех целочисленных типов данных в следующем виде:
//  Все 4 переменные типа byte должны равняться 12 и быть записанны в разных системах счисления;
//  Все 4 переменные типа short должны равняться 1300 и быть записанны в разных системах счисления;
//  Все 4 переменные типа int должны равняться 0 и быть записанны в разных системах счисления;
//  Все 4 переменные типа long должны равняться 123456789 и быть записанны в разных системах счисления;
//  И вывести их на экран.
//        РЕШЕНИЕ:
        byte b1 = 12;
        byte b2 = 014;
        byte b3 = 0xC;
        byte b4 = 0b1100;

        short s1 = 1300;
        short s2 = 02424;
        short s3 = 0x514;
        short s4 = 0b10100010100;

        int i1 = 0;
        int i2 = 00;
        int i3 = 0x0;
        int i4 = 0b0;

        long l1 = 123456789L;
        long l2 = 0726746425L;
        long l3 = 0x75BCD15L;
        long l4 = 0b111010110111100110100010101L;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        
//        ЗАДАНИЕ 2
// Создать по 2 переменные типов данных float, double и boolean. И вывести их на экран.
//        РЕШЕНИЕ:
        float f1 = 3.14F;
        float f2 = 10.5F;

        double d1 = 15.75;
        double d2 = -8.12345;

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(f1);
        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(bool1);
        System.out.println(bool2);

//        ЗАДАНИЕ 3
// Создать n-ное количество переменных типа данных char всеми возможными способами. И вывести их на экран.
//        РЕШЕНИЕ:
        char c1 = 'P';        // просто буква 
        char c2 = 80;         // как число
        char c3 = 0x50;       // в 16й сс
        char c4 = 0b1010000;  // в 2й сс
        char c5 = '\u0050';   // через Unicode

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}