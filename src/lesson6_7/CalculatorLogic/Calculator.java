package lesson6_7.CalculatorLogic;

import lesson6_7.Exceptions.UnsupportedOperationException;
import lesson6_7.Operations.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private static final Map<Character, Operation> OPERATION = new HashMap<>();
    private final char operator;
    private double result;
    private final double firstNumber, secondNumber;

    public Calculator(char operator, double firstNumber, double secondNumber) throws Exception {
        this.operator = operator;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        calculateResult();
    }

    static {
        OPERATION.put('+', new Addition());
        OPERATION.put('-', new Subtraction());
        OPERATION.put('*', new Multiplication());
        OPERATION.put('/', new Division());
    }

    public String getArabicResult() {
        return String.valueOf(result);
    }

    public String getRomanResult() throws Exception {
        return String.valueOf(RomanNumerals.toRomanNumber((int) result));
    }

    private void calculateResult() throws Exception {
        Operation operation = OPERATION.get(operator);
        if (operation != null) result = operation.getResultFor(firstNumber, secondNumber);
        else throw new UnsupportedOperationException();
    }
}