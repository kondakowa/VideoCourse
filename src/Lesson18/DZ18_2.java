package Lesson18;

public class DZ18_2 {

    public static void showArray(String[][] array) {

        System.out.print("{ ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("{");

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);

                if (j < array[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");

            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        String[][] a = {{"fveb", "груша"}, {"wargwgrsg"}, {"dgbrdse", "rga"}};
        showArray(a);
        showArray(new String[][]{{"rgbeb", "sb"}, {"fb"}, {"erb", "abvreb"}});
        showArray(new String[][]{{"rgbeb", "sb"}, {"fb", "sfbsbesfdb"}, {"erb", "abvreb"}});
        showArray(new String[][]{{"fb", "sfbsbesfdb", "fbdeb"}});
    }
}
