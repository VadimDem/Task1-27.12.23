import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер билета (6 цифр): ");
        int ticketNumber = scanner.nextInt();

        // Проверяем, является ли билет "счастливым"
        boolean isLucky = isLuckyTicket(ticketNumber);

        // Выводим результат
        if (isLucky) {
            System.out.println("Этот билет счастливый!");
        } else {
            System.out.println("Этот билет не счастливый.");
        }
    }

    // Метод для проверки, является ли билет "счастливым"
    private static boolean isLuckyTicket(int ticketNumber) {
        // Разбиваем номер билета на отдельные цифры
        int digit6 = ticketNumber % 10;
        int digit5 = (ticketNumber / 10) % 10;
        int digit4 = (ticketNumber / 100) % 10;
        int digit3 = (ticketNumber / 1000) % 10;
        int digit2 = (ticketNumber / 10000) % 10;
        int digit1 = ticketNumber / 100000;

        // условия счастливого билета
        boolean sumEven = (digit1 + digit2 + digit3) % 2 == 0 &&
                (digit4 + digit5 + digit6) % 2 == 0;
        boolean sumsEqual = digit1 + digit2 + digit3 == digit4 + digit5 + digit6;

        return sumEven && sumsEqual;
    }
}
