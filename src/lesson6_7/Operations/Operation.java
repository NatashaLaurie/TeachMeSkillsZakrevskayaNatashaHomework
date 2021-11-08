package lesson6_7.Operations;

import lesson6_7.Exceptions.DivisionToNullException;

public interface Operation {
    double getResultFor(double firstValue, double secondValue) throws DivisionToNullException;
}