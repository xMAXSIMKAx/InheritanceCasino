package Casino;

class GameType extends Game {

    //Створюємо конструктор який викликає,
    // конструктор базового ккласу супер
    public GameType(double stake) {
        super(stake);
    }

    //перевизначаєм метод підрахування
    @Override
    public double calculateWin() {
        if (stake < 3) {
            return 1.25 * stake;
        } else if (stake >= 3 && stake <= 7) {
            return 1.25 * stake - 0.05 * stake;
        } else {
            return 2 * stake - 0.1 * (2 * stake);
        }
    }
}