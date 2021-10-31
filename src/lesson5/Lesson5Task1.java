package lesson5;

import java.util.Scanner;

/**
 * Создать программу, которая позволяет ввести с клавиа-туры массив размером n и отсортировать его по убыванию.
 */
public class Lesson5Task1 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        initArray(arr);
        System.out.println("Your array: ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("\nSorted array: ");
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int j : array) System.out.print(j + " ");
    }

    public static void initArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + (i + 1) + " element of array: ");
            array[i] = scan.nextInt();
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}