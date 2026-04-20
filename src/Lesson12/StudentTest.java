package Lesson12;

public class StudentTest {

    // 1. Метод с одним if и логическими операторами
    public static void compareSimple(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты НЕ равны");
        }
    }

    // 2. Метод с вложенными if и выводом первого различия
    public static void compareDetailed(Student s1, Student s2) {

        if (s1.name.equals(s2.name)) {

            if (s1.course == s2.course) {

                if (s1.grade == s2.grade) {
                    System.out.println("Студенты полностью равны");
                } else {
                    System.out.println("Различие найдено: grade");
                }

            } else {
                System.out.println("Различие найдено: course");
            }

        } else {
            System.out.println("Различие найдено: name");
        }
    }

    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Ivan", 3, 9.5);
        Student st3 = new Student("Petr", 1, 5.3);

        compareSimple(st1, st2);     // равны
        compareSimple(st1, st3);     // не равны

        compareDetailed(st1, st2);   // полностью равны
        compareDetailed(st1, st3);   // покажет первое различие
    }
}

