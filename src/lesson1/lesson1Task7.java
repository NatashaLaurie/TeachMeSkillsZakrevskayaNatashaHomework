package lesson1;

import java.util.Scanner;

/**
 * 7) (Дополнительно) В переменную записываете количество программистов. В
 * зависимости от количества программистов необходимо вывести правильно
 * окончание. Например:
 * • 2 программиста
 * • 1 программиста
 * • 10 программистов
 * • и т.д.
 */
public class lesson1Task7 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int randomInteger;
        for (int i = 0; i < 10; i++) {
            randomInteger = (int) (Math.random() * 500);
            printNumberOfProgrammers(randomInteger);
        }
    }

    public static void printNumberOfProgrammers(int number) {
        System.out.print(number + " программист");
        switch (number % 10) {
            case 1:
                if (number % 100 == 11) {
                    System.out.println("ов ");
                } else {
                    System.out.println(" ");
                }
                break;
            case 2, 3, 4:
                switch (number % 100) {
                    case 12, 13, 14 -> System.out.println("ов ");
                    default -> System.out.println("а ");
                }
                break;
            default:
                System.out.println("ов ");
        }
    }
}