package Lesson22;

public class Chelovek {

    final String pol;

   public Chelovek(String pol) {
        this.pol = pol;
    }
    private boolean clever;
    public boolean isClever(){
    return clever;
    }

    private String name; // инкапсуляция

    public String getName() { //геттер
        return name;
    }

    public void setName(String s) { //сеттер
        name = s;
    }

    private int vozrast;// инкапсуляция

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            vozrast = i;
        }
    }

    private int ves;// инкапсуляция

    public int getVes() {
        return ves;

    }

    public void setVest(int i) {
        if (i > 0) {
            ves = i;

        }
    }
}

class Test {

    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolya");
        c.setVest(50); //должны бвть какие то границы, будем применять инкапсуляцию
        c.setVozrast(15);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());

    }

}
