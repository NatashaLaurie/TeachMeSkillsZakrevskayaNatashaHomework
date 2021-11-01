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