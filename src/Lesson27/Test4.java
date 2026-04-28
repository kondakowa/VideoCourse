/*package Lesson27;

import java.io.*;

public class Test4 {

    void abc() throws FileNotFoundException {
        File f = new File("test8.txt");
        //try {
        FileInputStream fis = new FileInputStream(f);
        //fis.read();
        System.out.println("Vsem xoroshego dnya!");
        //} catch (FileNotFoundException e) {
        //    System.out.println("Bil poyman exception :" + e);
        //}
        abc();
    }

    void def() throws FileNotFoundException {
        System.out.println("privet");
        abc();
    }

    public static void main(String[] args) {
        Test4 t = new Test4();

        try {

            t.def();
        } catch (FileNotFoundException e) {
            System.out.println("Bil poyman exception :" + e);
        }
    }
}
