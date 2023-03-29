package HW1.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите слово: ");
            String inputWord = scanner.nextLine();
            if (inputWord.equals("exit")) {
                System.out.println("Программа завершена.");
                break;
            } else {
                System.out.println("Вы ввели: " + inputWord);
            }
        }
        scanner.close();
    }
}