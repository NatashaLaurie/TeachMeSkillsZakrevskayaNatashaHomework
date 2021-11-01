package lesson3;

import java.util.Scanner;

public class Computer {

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