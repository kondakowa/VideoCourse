/*package Lesson27;

import java.io.*;

public class Test6 {

    public static void main(String[] args) {
        try {
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("Poyman exception 2");

        } catch (NullPointerException e) {
            System.out.println("Poyman exception 1");
        }catch (IOException e) {
            System.out.println("Poyman exception 3");
        }
        catch (RuntimeException e) {
            System.out.println("Poyman exception 4");
        }
        catch (Exception e) {
            System.out.println("Poyman exception 5");
        }
        catch (Throwable e) {
            System.out.println("Poyman exception 6");
        }
    }
}
