package Lesson27;

public class Lesson27 {

    public static void main(String[] args) {

        Tiger t = new Tiger();

        t.eat("myaso");

        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Tiger {

    public void eat(String c) {
        if (!c.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + c);
        }
        System.out.println("Tigr est myaso");
    }

    public void drink(String d) throws NeVodaException {
        if (!d.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + d);
        }
        System.out.println("Tigr pyet vodu");
    }
}

class NeMyasoException extends RuntimeException {

    NeMyasoException(String a) {
        super(a);
    }
}

class NeVodaException extends Exception {

    NeVodaException(String b) {
        super(b);
    }
}
