package matrix.entity;

import matrix.exception.MatrixException;

import java.util.Arrays;

/**
 * Class {@code Matrix} is designed to storage data about matrix.
 * Created by HP on 01.03.2022.
 *
 * @author Zakrevskaya Nataliya
 * @version 1.0
 */
public class Matrix {

    /**
     * Field matrix
     */
    private final double[][] matrix;

    /**
     * Constructor of class
     *
     * @param matrix matrix
     * @see Matrix#Matrix(int, int)
     */
    public Matrix(double[][] matrix) {
        this.matrix = Arrays.copyOf(matrix, matrix.length);
    }

    /**
     * Constructor of class
     *
     * @param n vertical size
     * @param m horizontal size
     * @throws MatrixException if n or m (size of matrix) is negative.
     * @see Matrix#Matrix(double[][])
     */
    public Matrix(int n, int m) throws MatrixException {
        // проверка на отрицательные значения размерности матрицы
        if ((n < 1) || (m < 1)) {
            throw new MatrixException();
        }
        matrix = new double[n][m];
    }

    /**
     * Returns value of field {@link Matrix#matrix}
     *
     * @return field value {@link Matrix#matrix}
     */
    public double[][] getMatrix() {
        return matrix;
    }

    /**
     * Returns vertical size of matrix
     *
     * @return vertical size
     */
    public int getVerticalSize() {
        return matrix.length;
    }

    /**
     * Returns horizontal size of matrix
     *
     * @return horizontal size
     */
    public int getHorizontalSize() {
        return matrix[0].length;
    }

    /**
     * Returns element of matrix
     *
     * @param i number of line
     * @param j number of element in chosen line
     * @return element of matrix
     * @throws MatrixException if coordinates of element are bad
     */
    public double getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) { // проверка i и j
            return matrix[i][j];
        }
        throw new MatrixException();
    }

    /**
     * Defines element of matrix
     *
     * @param i     number of line
     * @param j     number of element in chosen line
     * @param value value of element
     * @throws MatrixException if coordinates of element are bad
     */
    public void setElement(int i, int j, double value) throws MatrixException {
        if (checkRange(i, j)) { // проверка i и j
            matrix[i][j] = value;
        } else {
            throw new MatrixException();//опечатка в учебнике!!
        }
    }


    /**
     * Prints matrix in needed format.
     *
     * @return string
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nMatrix : " + matrix.length + "x" + matrix[0].length + "\n");
        for (double[] row : matrix) {
            for (double value : row) {
                //s.append(value + " ");
                s.append(String.format("%6.2f", value));
            }
            s.append("\n");
        }
        return s.toString();
    }

    /**
     * Method for checking whether coordinates are valid.
     *
     * @param i number of line
     * @param j number of element in chosen line
     * @return {@code true} if coordinates are valid
     * and {@code false} otherwise
     */
    // проверка возможности выхода за пределы матрицы
    private boolean checkRange(int i, int j) {
        return i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length;
    }
}