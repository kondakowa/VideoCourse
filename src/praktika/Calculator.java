
package praktika;

import java.util.Scanner;//подключает класс Scanner, который позволяет считывать данные, введённые пользователем с клавиатуры.

// Класс с арифметическими методами
class Calculator {//создаёт новый класс Calculator. В Java класс — это «шаблон» или «контейнер» для данных и методов, связанных с этой сущностью.

    // Сложение
    int add(int a, int b) { // объявление метода add, который принимает два целых числа (a и b) и возвращает целое число (int).
        return a + b;//возвращает результат сложения a и b.
    }

    // Вычитание
    int subtract(int a, int b) {
        return a - b;
    }

    // Умножение
    int multiply(int a, int b) {
        return a * b;
    }

    // Деление
    double divide(int a, int b) {
        if (b == 0) { // проверка, делим ли мы на ноль. Деление на ноль в Java вызовет ошибку, поэтому мы сначала предупреждаем пользователя.
            System.out.println("Ошибка: деление на ноль!");
            return 0; // Возвращаем 0 при ошибке
        }
        return (double) a / b;//делим a на b и приводим результат к double, чтобы получить дробное число, а не целое.
    }
}

// Главный класс программы
public class Main { // Создаём главный класс программы Main.
    public static void main(String[] args) { // Главный метод программы. Именно с него Java начинает выполнение программы.String[] args — массив аргументов командной строки, его мы здесь не используем.
        Scanner scanner = new Scanner(System.in); // Создаём объект scanner, который будет считывать данные, введённые пользователем.
        Calculator calc = new Calculator(); // Создаём объект класса Calculator.Через этот объект мы будем вызывать методы сложения, вычитания, умножения и деления.
        boolean continueProgram = true; // Булева переменная, которая будет управлять циклом программы.Пока continueProgram = true, программа будет спрашивать пользователя о числах и операциях.

        while (continueProgram) { // Цикл while выполняется до тех пор, пока условие continueProgram истинно (true).
            System.out.println("Введите первое число:");
            int num1 = scanner.nextInt(); // scanner.nextInt() считывает целое число с клавиатуры и сохраняет его в переменную num1.

            System.out.println("Введите второе число:");
            int num2 = scanner.nextInt();

            System.out.println("Выберите операцию (+, -, *, /):");
            String op = scanner.next();

            double result = 0; // Создаём переменную result для хранения результата операции.

            // Выбор операции
            if (op.equals("+")) {
                result = calc.add(num1, num2);
            } else if (op.equals("-")) { // op.equals("+") — сравниваем строки, потому что в Java нельзя использовать == для сравнения строк.
                result = calc.subtract(num1, num2);
            } else if (op.equals("*")) {
                result = calc.multiply(num1, num2);
            } else if (op.equals("/")) {
                result = calc.divide(num1, num2);
            } else {
                System.out.println("Неверная операция!");
                continue;
            }

            System.out.println("Результат: " + result);

            // Спрашиваем, продолжать ли
            System.out.println("Хотите продолжить? (да/нет)");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("нет")) { // Если пользователь ввёл «нет» (регистр неважен), меняем continueProgram на false, чтобы выйти из цикла.
                continueProgram = false;
                System.out.println("Программа завершена.");
            }
        }

        scanner.close();
    }
}