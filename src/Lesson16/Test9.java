package Lesson16;

public class Test9 {

    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = new String("privet");
        String s4 = new String("privet");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s10 = "Kak Dela?";
        String s11 = "kak dela?";
        System.out.println(s10 == s11);
        System.out.println(s10.equals(s11));
        System.out.println(s10.equalsIgnoreCase(s11));
    }
}
