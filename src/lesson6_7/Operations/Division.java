package lesson6_7.Operations;

import lesson6_7.Exceptions.DivisionToNullException;

public class Division implements Operation {
    @Override
    public double getResultFor(double firstValue, double secondValue) throws DivisionToNullException {
        if (secondValue != 0) {
            return firstValue / secondValue;
        } else throw new DivisionToNullException();
    }
}