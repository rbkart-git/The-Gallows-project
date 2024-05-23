import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class gallows {

    /*меню игры*/
    public static void main(String[] args) throws FileNotFoundException {
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
        File textFile = new File("D:\\Repositories\\The Gallows project\\dictionary.txt");
        Scanner readTextFile = new Scanner(textFile);
        ArrayList<String> dictionary = new ArrayList<String>();

        while(readTextFile.hasNextLine()) {
            dictionary.add(readTextFile.nextLine());
        }
        readTextFile.close();

        int errorCounter = 0; // счётчик ошибок
        ArrayList<String> lettersEntered = new ArrayList<>(); // сюда буду записывать буквы, которые ввёл пользователь

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
        System.out.println("Ошибок допущено: " + errorCounter);
        System.out.println("Введённые ранее буквы: " + lettersEntered);
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

        Scanner letterEntered = new Scanner(System.in);
        System.out.println("Введите букву");
        String letter = letterEntered.nextLine();
        letterEntered.close();

        do {
            boolean flag = false;
            String numbers = "0123456789";
            int value = numbers.indexOf(letter);
            if (value != -1) {
                flag = true;
            } else {
                flag = false;
            }

            /* реализовать if...else на основе сравнение символа строки со строками "0123456789" и "абвгдезжикмино   и т.д." "abcdefghi  и т.д."
            * это должно быть в теле цикла и при вводе числа, специального символа или английской буквы выводиться сообщение о неккоректном вводе
            * и повторяться ввод;
            *   */



        } while(true);




        bodyOfTheGame(errorCounter, lettersEntered, letter, randomElement, hiddenWord);
    }

    public static void bodyOfTheGame(int errorCounter, ArrayList<String> lettersEntered, String letter, String randomElement, String hiddenWord) {




    }





}
