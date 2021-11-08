package lesson6_7.Operations;

import lesson6_7.Exceptions.DivisionToNullException;

public class Subtraction implements Operation {
    @Override
    public double getResultFor(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }
}