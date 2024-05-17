import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

        System.out.println(dictionary);

        // нарисовать пустой каркас виселицы

        // отобразить счётчик ошибок и введённые ранее буквы
        // предложить ввод буквы

    }

    public static void randomWordSelection() {
        // случайным образом выбрать слово из словаря
    }

    public static void makeWord() {
        // отобразить загаданное слово, наложив на него маску и открыв две случайные буквы
    }








}