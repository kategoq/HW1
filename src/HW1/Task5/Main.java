package HW1.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        int sum = 0;
        for (int i = firstNumber + 1; i < secondNumber; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех чисел, которые делятся на 3 и расположены между " + firstNumber + " и " + secondNumber + ": " + sum);
    }
}