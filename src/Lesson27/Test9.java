/*package Lesson27;

import java.io.*;

public class Test9 {

    static StringBuilder abc() throws FileNotFoundException {

        try {
            File f = new File("test9.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e;
        } finally {

            System.out.println("eto block finally");

        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i polnostyu obrabotan");
        }
    }

    /*void def() {
        try {
            int [] array={1,2,3};
            System.out.println(array[5]);
           
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e;
        } finally {

            System.out.println("eto block finally");

        }
     }

*/