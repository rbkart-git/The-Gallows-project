import java.util.Scanner;

class gallows {
    public static void main(String[] args) {


        Scanner decision = new Scanner(System.in);
        System.out.println("Для начала игры введите Да или Нет.");
        String startVar = decision.nextLine();

        if (startVar.equals("Да")) {
            makeWord();
        } else if (startVar.equals("Нет")) {
            System.out.println("Игра окончена. До встречи.");
        } else {
            System.out.println("Некорректное значение. Повторите ввод.");
        }
    }



    public static void makeWord() {
        System.out.println("start");
    }


}