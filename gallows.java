import java.util.Scanner;

class gallows {
    public static void main(String[] args) {
        boolean counter = false;
    do {
        Scanner decision = new Scanner(System.in);
        System.out.println("Для начала игры введите Да или Нет.");
        String startVar = decision.nextLine();

        if (startVar.equals("Да")) {
            makeWord();
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



    public static void makeWord() {
        System.out.println("start");
    }


}