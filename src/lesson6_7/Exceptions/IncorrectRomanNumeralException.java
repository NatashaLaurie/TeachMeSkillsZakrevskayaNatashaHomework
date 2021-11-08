package lesson6_7.Exceptions;

public class IncorrectRomanNumeralException extends Exception {
    public IncorrectRomanNumeralException() {
        super("Incorrect roman numeral!");
    }
}