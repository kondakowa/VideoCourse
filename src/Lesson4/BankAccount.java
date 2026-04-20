package Lesson4;

class BankAccount {
    int id;
    String name;
    double balance;

    void popolnenieScheta(double summa) {
        balance += summa;
    }

    void snyatieSoScheta(double summa) {
        balance -= summa;
    }
}

public class DZ5 {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Ksenya";
        myAccount.balance = 12.35;

        // До пополнения
        System.out.println("Баланс до пополнения: " + myAccount.balance);

        // Пополнение
        myAccount.popolnenieScheta(10);
        System.out.println("Баланс после пополнения: " + myAccount.balance);

        // Снятие
        myAccount.snyatieSoScheta(5);
        System.out.println("Баланс после снятия: " + myAccount.balance);
    }
}