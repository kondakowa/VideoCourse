//     Задание 2
// Измените класс Student так, чтобы он имел 3 конструктора.
// 1‑ый принимает все параметры.
// 2‑ой — только id, name, surname, course.
// 3‑ий не принимает значений.
// Создайте в классе StudentTest 3 объекта с помощью разных конструкторов.

package Lesson6;

public class Student  {

    int id;
    String firstname;
    String lastname;
    int year;          
    double avgmatem;
    double avgeconom;
    double avgyozik;

    public Student(int id, String firstname, String lastname, int year,
                   double avgmatem, double avgeconom, double avgyozik) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
        this.avgmatem = avgmatem;
        this.avgeconom = avgeconom;
        this.avgyozik = avgyozik;
    }

    public Student(int id, String firstname, String lastname, int year) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
    }

    public Student() {
    }
}

class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.id = 1;
        student1.firstname = "Ksenya";
        student1.lastname = "Kondakova";
        student1.year = 2026;
        student1.avgmatem = 5;
        student1.avgeconom = 4.5;
        student1.avgyozik = 4.2;

        Student student2 = new Student(2, "Slava", "Lazarev", 2026);
        student2.avgmatem = 4.7;
        student2.avgeconom = 4.3;
        student2.avgyozik = 4.1;

        Student student3 = new Student(
                3, "Stepa", "Stepanov", 2026,
                3.4, 3.2, 4.8
        );

        double AVG1 = (student1.avgmatem + student1.avgeconom + student1.avgyozik) / 3;
        double AVG2 = (student2.avgmatem + student2.avgeconom + student2.avgyozik) / 3;
        double AVG3 = (student3.avgmatem + student3.avgeconom + student3.avgyozik) / 3;

        System.out.println("Студент: " + student1.firstname + " " + student1.lastname);
        System.out.println("Средняя оценка: " + AVG1);
        System.out.println();

        System.out.println("Студент: " + student2.firstname + " " + student2.lastname);
        System.out.println("Средняя оценка: " + AVG2);
        System.out.println();

        System.out.println("Студент: " + student3.firstname + " " + student3.lastname);
        System.out.println("Средняя оценка: " + AVG3);
        System.out.println();
    }
}
