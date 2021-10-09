package lesson1;

import java.util.Scanner;

/**
 * 2) Треугольник существует только тогда, когда сумма любых двух его сторон
 * больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
 * стороны предполагаемого треугольника. Требуется сравнить длину каждого
 * отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
 * окажется больше суммы двух других, то треугольника с такими сторонами не
 * существует.
 */
public class lesson1Task2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;
        System.out.print("Enter the lengths of the sides of the triangle \na:");
        a = scan.nextInt();
        System.out.print("b:");
        b = scan.nextInt();
        System.out.print("c:");
        c = scan.nextInt();

        if (isTriangle(a, b, c)) System.out.print("Triangle exists!");
        else System.out.print("Triangle DOESN'T exist!");

    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
