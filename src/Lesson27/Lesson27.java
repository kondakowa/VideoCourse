package Lesson27;

public class Lesson27 {

    public static class NeMyasoException extends RuntimeException {

        public NeMyasoException(String a) {
            super(a);
        }
    }

    public static class NeVodaException extends Exception {

        public NeVodaException(String b) {
            super(b);
        }
    }

    public static class Tiger {

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

    public static void main(String[] args) {

        Tiger t = new Tiger();

        t.eat("myaso");

        try {
            try {
                t.drink("voda");
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
