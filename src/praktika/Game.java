
package praktika;

import java.util.Scanner; // Подключаем Scanner для ввода данных от пользователя

// Класс, который хранит загаданное число и проверяет догадки
class Game {
    private int number; // Здесь будет храниться загаданное число

    // Конструктор класса Game. Сразу задаём случайное число от 1 до 50
    Game() {
        number = 1 + (int)(Math.random() * 50); // Math.random() возвращает число от 0.0 до 1.0
    }

    // Метод проверяет догадку пользователя
    // Возвращает true, если пользователь угадал число
    boolean checkGuess(int guess) {
        if (guess == number) { // Если догадка равна загаданному числу
            return true;       // Угадал!
        } else if (guess > number) { // Если догадка больше загаданного числа
            System.out.println("Слишком большое число!"); // Подсказка
        } else { // Если догадка меньше загаданного числа
            System.out.println("Слишком маленькое число!"); // Подсказка
        }
        return false; // Возвращаем false, потому что не угадал
    }
}

// Главный класс программы
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаём Scanner для ввода
        Game game = new Game(); // Создаём объект игры
        boolean guessed = false; // Булева переменная, которая отслеживает, угадал ли пользователь
        int attempts = 0; // Счётчик попыток

        System.out.println("Я загадал число от 1 до 50. Попробуй угадать!"); // Приветственное сообщение

        // Пока пользователь не угадал число
        while (!guessed) {
            System.out.println("Введите число:"); // Просим пользователя ввести число
            int guess = scanner.nextInt(); // Читаем число с клавиатуры
            attempts++; // Увеличиваем счётчик попыток на 1

            guessed = game.checkGuess(guess); // Проверяем догадку, метод вернёт true или false

            if (guessed) { // Если угадал
                System.out.println("Поздравляю! Ты угадал число за " + attempts + " попыток.");
            }
        }

        scanner.close(); // Закрываем Scanner, чтобы освободить ресурсы
    }
}