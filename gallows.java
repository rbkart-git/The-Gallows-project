import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class gallows {

    public static void main(String[] args) throws FileNotFoundException {
        boolean counter = false;
    do {
        Scanner decision = new Scanner(System.in);
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
            counter = true;
        }
        } while(counter == true);
    }

    public static void startGame() throws FileNotFoundException {
        File textFile = new File("D:\\Repositories\\The Gallows project\\dictionary.txt");
        Scanner readTextFile = new Scanner(textFile);
        ArrayList<String> dictionary = new ArrayList<String>();
        while(readTextFile.hasNextLine()) {
            dictionary.add(readTextFile.nextLine());
        }
        readTextFile.close();
        System.out.println("---------");
        System.out.println("|      |");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("---------");
        randomWordSelection(dictionary);



        // отобразить счётчик ошибок и введённые ранее буквы
        // предложить ввод буквы
    }

    public static void randomWordSelection(ArrayList<String> dictionary) {
        Random randIndex = new Random();
        String randomElement = dictionary.get(randIndex.nextInt(dictionary.size()));
        makeWord(randomElement);
    }

    public static void makeWord(String randomElement) {
        // сюда передал выбранное слово
        // в символьную переменную нужно положить символ, которым будет накладываться маска
        // создать переменные, в которые положить начальный индекс строки (слова) и конечный индекс
        // циклом for и методом setCharAt() накладывать маску на слово, но нужно найти способ выбирать случайный диапазон накладывания маски




        // отобразить загаданное слово, наложив на него маску и открыв две случайные буквы

    }








}