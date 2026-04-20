package Lesson18;

public class DZ18_1 {

    public static int[] sortirovka(int[] array) {

        int a;

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }
    
    public static void main(String[] args) {

        int[] array = {5, 7, 4, 8, 2, -9, 1, 9, 3, -2};

        System.out.print("Исходный массив: ");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        
        System.out.println();

        sortirovka(array);

        System.out.print("Отсортированный массив: ");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
