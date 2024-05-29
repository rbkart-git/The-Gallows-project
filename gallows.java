import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class gallows {

    /*меню игры*/
    public static void main(String[] args) throws FileNotFoundException {

        /* Меню игры */
        boolean flag = false;
        Scanner decision = new Scanner(System.in);
        do {
            System.out.println("Для начала игры введите Да или Нет.");
            String startVar = decision.nextLine();
            if (startVar.equals("Да")) {
                startGame();
                break;
            } else if (startVar.equals("Нет")) {
                System.out.println("Игра окончена. До встречи.");
                break;
            } else {
                System.out.println("Некорректное значение. Повторите ввод.");
                flag = true;
            }
        } while(flag = true);
        decision.close();
    }

    /*начало игры*/
    public static void startGame() throws FileNotFoundException {

        /* Создаю словарь слов */
        File textFile = new File("D:\\Repositories\\The Gallows project\\dictionary.txt");
        Scanner readTextFile = new Scanner(textFile);
        ArrayList<String> dictionary = new ArrayList<String>();

        while(readTextFile.hasNextLine()) {
            dictionary.add(readTextFile.nextLine());
        }
        readTextFile.close();

        /* Выбираю случайное слово из словаря и накладываю на него маску */
        Random randIndex = new Random();
        String randomElement = dictionary.get(randIndex.nextInt(dictionary.size()));
        int wordLength = randomElement.length();
        String mask = "*";
        String hiddenWord = mask.repeat(wordLength);
        if (wordLength == 1 || wordLength == 11) {
            System.out.println("Слово состоит из " + wordLength + " буквы");
        } else if (wordLength > 1 && wordLength < 11 || wordLength > 11 || wordLength < 21) {
            System.out.println("Слово состоит из " + wordLength + " букв");
        }
        System.out.println("---------");
        System.out.println("|       |");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("---------");

        /*Валидация введённого символа*/
        boolean flag = false;
        Scanner letterEntered = new Scanner(System.in);
        do {
            System.out.println("Введите букву");
            String letter = letterEntered.nextLine();
            Pattern patternCyrillic = Pattern.compile("[а-яА-Я]");
            Matcher matcherCyrillic = patternCyrillic.matcher(letter);

            if (matcherCyrillic.find()) {
                comparingCharacterInWord(hiddenWord, letter);
                break;
            } else {
                System.out.println("Символ введён неправильно, повторите ввод.");
                flag = true;
            }
        } while(flag = true);
        letterEntered.close();
    }

    /*сравнение введённого символа с выбранным словом из словаря*/
    public static void comparingCharacterInWord(String hiddenWord, String letter) {
        int errorCounter = 0; // счётчик ошибок
        ArrayList<String> lettersEntered = new ArrayList<>(); // сюда буду записывать буквы, которые ввёл пользователь
        lettersEntered.add(letter);

        System.out.println("Введённые символы: " + lettersEntered);
        System.out.println("Ошибок допущено: " + errorCounter);
    }

}
