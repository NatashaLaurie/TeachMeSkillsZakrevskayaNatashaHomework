package lesson1;

import java.util.Scanner;

/**
 * 4) Даны 3 целых числа. Найти количество положительных чисел в исходном
 * наборе.
 * 5) Даны 3 целых числа. Найти количество положительных и отрицательных
 * чисел в исходном наборе.
 * 6) Даны 2 числа. Вывести большее из них.
 */
public class lesson1Task4_5_6 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int cntPositive = 0, cntNegative=0;
        int[]arr = new int[5];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random()*(200+1)) - 100;
            System.out.print(arr[i]+", ");
            if (arr[i] > 0) cntPositive++;
            else if (arr[i] < 0) cntNegative++;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) max = Math.max(max, arr[i]);

        System.out.print("\nThere are " + cntPositive + " positive numbers");
        System.out.print(" and " + cntNegative + " negative numbers");
        System.out.print("\nThe greatest number is " + max);

    }
}
