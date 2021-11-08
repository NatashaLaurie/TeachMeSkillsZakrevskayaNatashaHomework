package lesson6_7.Operations;

import lesson6_7.Exceptions.DivisionToNullException;

public class Addition implements Operation {
    @Override
    public double getResultFor(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}