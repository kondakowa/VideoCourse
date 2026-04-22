package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1= new Kvdrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshat();
    }

}

abstract class Figura { // если методы abstract, то и класс abstract, abstract может не содержать abstract методы
//abstract класс не может быть final
   
    /* Figura(int kolichestvoStoron){
    this.kolichestvoStoron=kolichestvoStoron;
}*/
    int kolichestvoStoron = 0;

    abstract void perimetr(); // у abstract методов не бывает тела

    abstract void ploshat();

    void showInfo() {
        System.out.println("Eto figura");
    }
}

class Kvdrat extends Figura {
/*Kvdrat(int kolichestvoStoron){
super(kolichestvoStoron);
this.kolichestvoStoron=kolichestvoStoron;
}*/
    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Perinetr kvadrata = " + 4 * storona1);
    }

    public void ploshat() {
        System.out.println("Ploshat kvadrata = " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {

    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Perinetr pryamougolnika = " + 2 * (storona2 + storona1));
    }

    public void ploshat() {
        System.out.println("Ploshat pryamougolnika = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {

    int radius = 3;

    public void perimetr() {
        System.out.println("Perinetr okrujnosti = " + 2 * 3.14 * radius);
    }

    public void ploshat() {
        System.out.println("Ploshat okrujnosti = " + 3.14 * radius * radius);
    }
}

abstract class Chetirexugolnik extends Figura {

    void def() {
        System.out.println("eto chetirexugolnik");
    }
}
