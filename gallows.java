import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class gallows {
    public static void main(String[] args) throws FileNotFoundException {
        startGame();
        while (startGame().equals("y")) {
            loadDictionary();
            choosingRandomWord(loadDictionary());
            hideWordMask(choosingRandomWord());
        }
    }

    // старт игры
    public static String startGame() {
        Scanner decision = new Scanner(System.in);
        String answer = "";
        while(!answer.equals("y") && !answer.equals("n")) {
            System.out.println("Начинаем игру - y/n");
            answer = decision.nextLine();
            switch (answer) {
                case "y" -> System.out.println("Запускаю игру...");
                case "n" -> System.out.println("Игра окончена. Всего хорошего.");
                default -> System.out.println("Недопустимое значение. Повторите ввод.");
            }
        }
        return answer;
    }

    // загрузка словаря и размещение его в динамическом массиве
    public static ArrayList<String> loadDictionary() throws FileNotFoundException {
        File textFile = new File("D:\\Repositories\\The Gallows project\\dictionary.txt");
        Scanner readTextFile = new Scanner(textFile);
        ArrayList<String> dictionary = new ArrayList<String>();
        while (readTextFile.hasNextLine()) {
            dictionary.add(readTextFile.nextLine());
        }
        readTextFile.close();
        return dictionary;
    }

    // выбор случайного слова из словаря
    public static String choosingRandomWord (ArrayList<String> dictionary) {
        Random randIndex = new Random();
        String randomElement = dictionary.get(randIndex.nextInt(dictionary.size()));
        return randomElement;
    }

    // наложение маски на выбранное слово
    public static String hideWordMask (String randomElement) {
        int wordLength = randomElement.length();
        String mask = "*";
        String hiddenWord = mask.repeat(wordLength);
        return hiddenWord;
    }

    public static void createGameParameters () {
        // показать пустой каркас виселицы
        // создать счётчик ошибок
        // создать динамический массив для введённых букв
    }

    public static void letterEntering () {
        /*
            while () {

                ввод буквы

                 если правильно -> openLetterCorrect
                 если не правильно -> letterEnterIncorrect
            }
         */

    }

    public static void openLetterCorrect () {
        // сравнить выбранное слово и введённую букву
        // отобразить букву
        // показать счётчик ошибок
        // показать введённые буквы
        // если все буквы введены правильно -> chekingEndGameVictory
    }

    public static void chekingEndGameVictory () {
        // вы победили, хотите сыграть еще?
    }

    public static void letterEnterIncorrect () {
        // добавить к виселице один элемент и показать её
        // инкремент счётчика ошибок и его показ
        // занести букву в список
        // счётчик ошибок больше допустимого -> chekingEndGameLoss
        // счётчик ошибок меньше допустимого -> letterEntering
    }

    public static void chekingEndGameLoss () {
        // вы проиграли, хотите сыграть еще?
    }
}