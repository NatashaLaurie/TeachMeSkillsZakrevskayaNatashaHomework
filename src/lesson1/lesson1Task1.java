package lesson1;

import java.util.Scanner;

/**
* 1) В переменную записываем число. Надо вывести на экран сколько в этом
* числе цифр и положительное оно или отрицательное. Например, "это
* однозначное положительное число". Достаточно будет определить, является ли
* число однозначным, "двухзначным или трехзначным и более.
 */
public class lesson1Task1 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter any integer: ");
        int number = scan.nextInt();
        int numberOfDigits = getNumberOfDigits(Math.abs(number));
        if (number > 0)
            System.out.println("You entered positive integer consists of " + numberOfDigits + " digits");
        else if (number==0) System.out.println("You entered zero");
        else System.out.println("You entered negative integer consists of " + numberOfDigits + " digits");

    }
    public static int getNumberOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
