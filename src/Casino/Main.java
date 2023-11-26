package Casino;

//імпортєм Scanner для зчитування ввделення з консолі

import java.util.Scanner;
// імпортуєм Random для генерування рандомних чисел
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // виділяєм память
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Вас вітає казирно GoldBlue \n");

        //получаєм інформацію від користувача
        System.out.print("Введіть ставку: ");
        double stake = scanner.nextDouble();

        // генеруєм рандомне число та виводим його
        int randomNumber = random.nextInt(10) + 1;
        // Генерувати випадкове число від 1 до 10
        System.out.println("Випало число: " + randomNumber);

        //виводим виграш в консоль
        GameType game = new GameType(stake);
        double win = game.calculateWin();
        System.out.println("Виграш для гри типу A: " + win);

        // закриваєм сканер
        scanner.close();
    }
}