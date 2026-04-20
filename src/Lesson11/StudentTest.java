package Lesson11;

public class StudentTest {

    void comparisonStudents (Student st1, Student st2) 
    {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) 
        {
            {
            System.out.println("     Первый метод сравнения с 1 if statement и с логическими операторами внутри него");
            System.out.println("Результат: студенты равны");
            }
        } 
        else 
        {
            {
            System.out.println("      Первый метод сравнения с 1 if statement");
            System.out.println("Результат: студенты не равны");
            }
        }
    }
    void comparisonStudents2 (Student st1, Student st2) 
    {
        if (st1.name.equals(st2.name)) 
        {

            if (st1.course == st2.course) 
            {

                if (st1.grade == st2.grade) 
                {
                    {
                     System.out.println("       ");
                     System.out.println("      Второй метод сравнения с nested if statement и сравнение всех атрибутов студента по отдельности");
                     System.out.println("Результат: студенты равны");
                    }
                } 
                else 
                {
                    {
                    System.out.println("     ");
                    System.out.println("      Второй метод сравнения с nested if statement и сравнение всех атрибутов студента по отдельности");
                    System.out.println("Результат: студенты не равны");
                    System.out.println("Основание: разные оценки");
                    }
                }
                   } 
            else 
            {
                       {
                     System.out.println("       ");    
                     System.out.println("      Второй метод сравнения с nested if statement и сравнение всех атрибутов студента по отдельности");
                     System.out.println("Результат: студенты не равны");
                     System.out.println("Основание: разные курсы");
                       }
                   }
               } 
        else 
        {
                   {
                     System.out.println("       ");
                     System.out.println("      Второй метод сравнения с nested if statement");
                     System.out.println("Результат: студенты не равны");
                     System.out.println("Основание: разные имена");
                    }
               }
           }
    public static void main(String[] args) 
    {
        
        Student st1 = new Student("Ksenya", 3, 4.8);
        Student st2 = new Student("Ksenya", 2, 4.2);

        StudentTest test = new StudentTest(); // можно сделать статик войд и убрать

        test.comparisonStudents(st1, st2);
        test.comparisonStudents2(st1, st2);
    }
    
}