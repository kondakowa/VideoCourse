package Lesson4;

public class Student  {
    
    int id;
    String firstname;
    String lastname;
    short year;
    double avgmatem;
    double avgeconom;
    double avgyozik;
}
class StudentTest {
        public static void main (String[] args) {
        
   Student Student1 = new Student ();
   Student Student2 = new Student ();
   Student Student3 = new Student ();
   
     Student1.id=1;
     Student1.firstname="Ksenya";
     Student1.lastname="Kondakova"; 
     Student1.year=2026;
     Student1.avgmatem=5;
     Student1.avgeconom=4.5;
     Student1.avgyozik=4.2;  
     
     Student2.id=2;
     Student2.firstname="Slava";
     Student2.lastname="Lazarev"; 
     Student2.year=2026;
     Student2.avgmatem=4.7;
     Student2.avgeconom=4.3;
     Student2.avgyozik=4.1;  
        
     Student3.id=3;
     Student3.firstname="Stepa";
     Student3.lastname="Stepanov"; 
     Student3.year=2026;
     Student3.avgmatem=3.4;
     Student3.avgeconom=3.2;
     Student3.avgyozik=4.8;
        
    double AVG1=(Student1.avgmatem+Student1.avgeconom+Student1.avgyozik)/3;
    double AVG2=(Student2.avgmatem+Student2.avgeconom+Student2.avgyozik)/3;
    double AVG3=(Student3.avgmatem+Student3.avgeconom+Student3.avgyozik)/3;
     
    System.out.println("Студент: " + Student1.firstname + " " + Student1.lastname);
    System.out.println("Номер билета: " + Student1.id);
    System.out.println("Год обучения: " + Student1.year);
    System.out.println("Средняя оценка по трем предметам: " + AVG1);
    System.out.println();  
    
    System.out.println("Студент: " + Student2.firstname + " " + Student2.lastname);
    System.out.println("Номер билета: " + Student2.id);
    System.out.println("Год обучения: " + Student2.year);
    System.out.println("Средняя оценка по трем предметам: " + AVG2);
    System.out.println();  
    
    System.out.println("Студент: " + Student3.firstname + " " + Student3.lastname);
    System.out.println("Номер билета: " + Student3.id);
    System.out.println("Год обучения: " + Student3.year);
    System.out.println("Средняя оценка по трем предметам: " + AVG3);
    System.out.println();  
        }    
}