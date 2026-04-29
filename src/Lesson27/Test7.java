/*package Lesson27;

import java.io.*;

public class Test7 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test9.txt");
            System.out.println("obyekt File sozdalasya");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdalasya");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Informaciya chitaetsya");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception 1");
        } catch (IOException e) {
            System.out.println("Exception 2");
        } finally {
            System.out.println("eto finally");
        }
    }
}*/
