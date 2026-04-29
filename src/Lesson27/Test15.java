/*
package Lesson27;

public class Test15 {

    void marafon(int temperaturaVozduxa, int tempBega) throws PodvernutNoguException {
        if (tempBega > 12) {
            throw new PodvernutNoguException("Temp bega bil slishkom visokim: " + tempBega);
        }
        if (temperaturaVozduxa > 32) {
            throw new SveloMishcuException();
        }
        System.out.println("Vi probejali marafon");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marafon(20, 8);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("V lyubom sluchae vi poluchite grammotu!!!");
        }
    }
}

    
class PodvernutNoguException extends Exception {
    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {
    }
}

class SveloMishcuException extends RuntimeException {
    SveloMishcuException(String message) {
        super(message);
    }

    SveloMishcuException() {
    }
}
*/