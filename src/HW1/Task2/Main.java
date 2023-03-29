package HW1.Task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        String letter = scanner.nextLine().toLowerCase();
        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Гласная буква");
                break;
            default:
                System.out.println("Согласная буква");
                break;
        }
    }
}
