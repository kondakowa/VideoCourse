package Lesson22;

public class DZ22_1 {

    private StringBuilder name;
    private int course;
    private int grade;

    public String getName() {
        return name.toString();
    }

    public void setName(StringBuilder name) {
        if (name != null && name.length() >= 3) {
            this.name = name;
        } else {
            System.out.println("Имя должно быть не менее 3-х символов");
        }
    }

    public int getCourse() {
        return course;
    }
    
    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Оценки должны быть в интервале от 1 до 10");
        }
    }
    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("Курс должен быть от 1 до 4 включительно");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void showInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Курс: " + getCourse());
        System.out.println("Оценка: " + getGrade());
    }
}


class TestStudent {

    public static void main(String[] args) {

        DZ22_1 s = new DZ22_1();

        s.setName(new StringBuilder("Stepan"));
        s.setCourse(3);
        s.setGrade(8);
        s.showInfo();
    }
}
