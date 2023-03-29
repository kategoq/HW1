package HW1.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        String letter = scanner.nextLine().toLowerCase();
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("Гласная буква");
        } else {
            System.out.println("Согласная буква");
        }
    }
}