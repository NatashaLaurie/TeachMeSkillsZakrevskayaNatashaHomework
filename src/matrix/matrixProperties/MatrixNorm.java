package matrix.matrixProperties;

import matrix.entity.Matrix;
import matrix.exception.MatrixException;

/**
 * Class {@code MatrixNorm} is the class that finds norm of matrix (first norm, infinite norm, Euclidean norm).
 * Created by HP on 01.03.2022.
 *
 * @author Zakrevskaya Nataliya
 * @version 1.0
 */
public class MatrixNorm {

    /**
     * Finds first matrix norm (the maximum of the numbers obtained by adding all the elements of each column,
     * taken modulo).
     *
     * @param matrix - matrix to work with
     * @return norm of a matrix (a number rounded to hundredths)
     * @throws MatrixException if the method {@code getElement} gives error
     */
    public double getFirstMatrixNorm(Matrix matrix) throws MatrixException {
        double max = 0.0;
        for (int i = 0; i < matrix.getHorizontalSize(); i++) {
            double sum = 0.0;
            for (int j = 0; j < matrix.getVerticalSize(); j++) {
                sum += Math.abs(matrix.getElement(j, i));
            }
            if (sum > max)
                max = sum;
        }
        return Math.ceil(max * 100) / 100;
    }

    /**
     * Finds infinite (third) matrix norm (the maximum of the numbers obtained by adding all the elements of each row,
     * taken modulo).
     *
     * @param matrix - matrix to work with
     * @return norm of a matrix (a number rounded to hundredths)
     * @throws MatrixException if the method {@code getElement} gives error
     */
    public double getInfiniteMatrixNorm(Matrix matrix) throws MatrixException {
        double max = 0.0;
        for (int i = 0; i < matrix.getVerticalSize(); i++) {
            double sum = 0.0;
            for (int j = 0; j < matrix.getHorizontalSize(); j++) {
                sum += Math.abs(matrix.getElement(i, j));
            }
            if (sum > max)
                max = sum;
        }
        return Math.ceil(max * 100) / 100;
    }

    /**
     * Finds Euclidean (second) matrix norm (square root of the sum of squares of all matrix elements).
     *
     * @param matrix - matrix to work with
     * @return norm of a matrix (a number rounded to hundredths)
     * @throws MatrixException if the method {@code getElement} gives error
     */
    public double getEuclideanMatrixNorm(Matrix matrix) throws MatrixException {
        double sum = 0.0;
        for (int i = 0; i < matrix.getVerticalSize(); i++) {
            for (int j = 0; j < matrix.getHorizontalSize(); j++) {
                sum += Math.pow(matrix.getElement(i, j), 2);
            }
        }
        sum = Math.sqrt(sum);
        return Math.ceil(sum * 100) / 100;
    }
}
