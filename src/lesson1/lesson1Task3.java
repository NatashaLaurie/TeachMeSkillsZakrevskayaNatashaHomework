package lesson1;

import java.util.Scanner;

/**
 * 3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
 * Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
 * 10. Вывести полученное число.
 */
public class lesson1Task3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        if (number>0) number+=1;
        else if (number<0) number-=2;
        else number = 10;
        System.out.println(number);

    }
}
