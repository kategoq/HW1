package HW1.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String monthName = scanner.nextLine().toLowerCase();
        String season = "";

        switch (monthName) {
            case "декабрь":
            case "январь":
            case "февраль":
                season = "Зима";
                break;
            case "март":
            case "апрель":
            case "май":
                season = "Весна";
                break;
            case "июнь":
            case "июль":
            case "август":
                season = "Лето";
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                season = "Осень";
                break;
            default:
                System.out.println("Ошибка: некорректное название месяца");
                System.exit(1); // завершение программы с кодом ошибки
        }

        System.out.println(monthName + " относится к сезону " + season);
    }
}
