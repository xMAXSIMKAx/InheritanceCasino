package Casino;

//імпортєм Scanner для зчитування ввделення з консолі

import java.util.Scanner;
// імпортуєм Random для генерування рандомних чисел
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Вас вітає казино GoldBlue\n");

        double bet = getBetFromUser(scanner);

        int randomNumber = generateRandomNumber(random);
        System.out.println("Випало число: " + randomNumber);

        displayWinForGame(bet);

        scanner.close();
    }

    private static double getBetFromUser(Scanner scanner) {
        System.out.print("Введіть вашу ставку: ");
        return scanner.nextDouble();
    }

    private static int generateRandomNumber(Random random) {
        return random.nextInt(10) + 1;
    }

    private static void displayWinForGame(double bet) {
        GameType game = new GameType(bet);
        double win = game.calculateWin();
        System.out.println("Ваш виграш: " + win);
    }
}
