package lesson6_7;

import lesson6_7.CalculatorLogic.CalculatorInputLogic;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Calc anything or enter '0' to exit:");
                String string = scan.nextLine();
                if (string.trim().equals("0")) {
                    break;
                }
                CalculatorInputLogic calc;
                calc = new CalculatorInputLogic(string);
                System.out.println(calc.getResult());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}