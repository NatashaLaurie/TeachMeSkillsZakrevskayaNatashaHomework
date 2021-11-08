package lesson6_7.CalculatorLogic;

import lesson6_7.Exceptions.InputException;

public class CalculatorInputLogic {
    private double firstValue;
    private double secondValue;
    private final char operation;
    boolean firstNumberIsArabic = true, secondNumberIsArabic = true;

    public CalculatorInputLogic(String inputString) throws Exception {
        String[] values = inputString.split(" ");
        if (values.length == 3) {
            try {
                this.firstValue = Double.parseDouble(values[0]);
            } catch (NumberFormatException e) {
                this.firstValue = RomanNumerals.toArabicNumber(values[0]);
                this.firstNumberIsArabic = false;
            }
            try {
                this.secondValue = Double.parseDouble(values[2]);
            } catch (NumberFormatException e) {
                this.secondValue = RomanNumerals.toArabicNumber(values[2]);
                this.secondNumberIsArabic = false;
            }

            this.operation = values[1].toCharArray()[0];
        } else throw new InputException();
    }

    public String getResult() throws Exception {
        if (this.firstNumberIsArabic && this.secondNumberIsArabic) {
            return new Calculator(operation, firstValue, secondValue).getArabicResult();
        }
        if (!this.firstNumberIsArabic && !this.secondNumberIsArabic) {
            return new Calculator(operation, firstValue, secondValue).getRomanResult();
        }
        return "%s / %s".formatted(new Calculator(operation, firstValue, secondValue).getArabicResult(), new Calculator(operation, firstValue, secondValue).getRomanResult());
    }
}