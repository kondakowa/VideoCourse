package Lesson19;

public class DZ19 {

    public static String[] abc(String[]... array) {
        int length = 0;
        for (String[] array1 : array) {
            length += array1.length;
        }

        String[] s = new String[length];
        int a = 0;

        for (String[] array1 : array) {
            for (String s1 : array1) {
                s[a] = s1;
                a++;
            }
        }
        return s;
    }

    public static void main(String[] args) {

        String[] s = abc(
                new String[]{"koshka", "Stepka", "Stepan"},
                new String[]{"Cat", "Kit", "cot"}
        );

        for (String arg : args) {
            for (int i = 0; i < s.length; i++) {
                if (arg.equals(s[i])) {
                    s[i] = null;
                }
            }
        }

        for (String s1 : s) {
            System.out.print(s1 + " ");
        }
        System.out.println();
    }
}
