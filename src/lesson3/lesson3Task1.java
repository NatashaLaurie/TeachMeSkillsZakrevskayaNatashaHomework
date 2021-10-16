package lesson3;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

/**
 * Создать класс компьютер.
 * Поля:
 * isOn boolean
 * - процессор    Boolean
 * - оперативка Boolean
 * - жесткий диск Boolean
 * - ресурс полных циклов работы (включений/выключений) int
 * Методы:
 * - метод описание(вывод всех полей)
 * вывод:  [“есть”, “есть”, “есть”, 18 циклов]
 * - метод включить, при включении может произойти сбой, при вызове метода
 * рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
 * угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
 * включить нужно выдать сообщение что ему конец
 * - выключить (аналогично включению)
 * - при превышении лимита ресурса комп сгорает
 */

public class lesson3Task1 {

    public static void main(String[] args) {
        Computer computer1 = new Computer(true, true, true, 5);
        computer1.displayComputerInfo();
        for (int i = 0; i < 5; i++) {
            computer1.turnOnComputer();
            computer1.turnOffComputer();
        }

    }
}

class Computer {
    private boolean processor;
    private boolean recentMemory;
    private boolean hardDisk;
    private int deviceCycleResource;
    private boolean isOn;

    public Computer() {
        this.processor = false;
        this.recentMemory = false;
        this.hardDisk = false;
        this.deviceCycleResource = 0;
        this.isOn = false;
    }

    public Computer(boolean processor, boolean recentMemory, boolean hardDisk, int deviceCycleResource) {
        this.processor = processor;
        this.recentMemory = recentMemory;
        this.hardDisk = hardDisk;
        this.deviceCycleResource = deviceCycleResource;
        this.isOn = false;
    }

    void displayComputerInfo() {
        System.out.println(
                "processor" + ((processor) ? " есть" : " нет") +
                        "\nrecentMemory" + ((recentMemory) ? " есть" : " нет") +
                        "\nhardDisk" + ((hardDisk) ? " есть" : " нет") +
                        "\n" + deviceCycleResource + " циклов");
    }

    private boolean isReadyToWork() {
        return (this.processor == this.recentMemory == this.hardDisk && this.deviceCycleResource > 0);
    }

    public void turnOnComputer() {
        if (!this.isOn) {
            if (isReadyToWork()) {
                if (guessingTheNumber()) {
                    this.isOn = true;
                    this.deviceCycleResource--;
                    System.out.println("ПОЗДРАВЛЯЕМ ВЫ УГАДАЛИ!!!! Компьютер включен");
                } else {
                    System.out.println("НЕ УГАДАЛИ!!!!! Компьютер сгорел:(");
                    this.deviceCycleResource = 0;
                }
            } else {
                System.out.println("К сожалению компьютер сгорел:(");
            }
        } else {
            System.out.println("Компьютер уже включен");
        }
    }

    private static boolean guessingTheNumber() {
        int randomNumber = (int) (Math.random() * 2);
        System.out.println("Чтобы включить компьютер введите 0 или 1: ");
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        return userNumber == randomNumber;
    }

    public void turnOffComputer() {
        if (this.isOn) {
            this.isOn = false;
            System.out.println("Компьютер выключен, оставшееся время работы " + this.deviceCycleResource + " циклов");
        } else {
            System.out.println("Компьютер уже выключен");
        }
    }
}