package Lesson16;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int i1 = s1.indexOf('t');
        System.out.println(i1);

        int i2 = s1.indexOf("vet");
        System.out.println(i2);

        int i3 = s1.indexOf("Z");
        System.out.println(i3);

        int i4 = s1.indexOf('z', 5);
        System.out.println(i4);

        boolean b1 = s1.startsWith("abc", 5);
        System.out.println(b1);

        boolean b2 = s1.endsWith("cd");
        System.out.println(b2);

    }
}
