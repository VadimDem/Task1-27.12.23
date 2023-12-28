import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер квартиры: ");
        int ApNum = scanner.nextInt();

        int floor = (ApNum - 1) / 4 + 1;  // Вычисление этажа
        int position = (ApNum - 1) % 4;     // Вычисление позиции

        // Определить место
        String place;
        if (position == 0) {
            place = "Дальняя слева";
        } else if (position == 1) {
            place = "Слева от лифта";
        } else if (position == 2) {
            place = "Справа от лифта";
        } else {
            place = "Дальняя справа";
        }

        System.out.println("Квартира №" + ApNum + " расположена на " + floor + " этаже, " + place + ".");
    }
}
