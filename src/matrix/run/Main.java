package matrix.run;

import matrix.create.MatrixCreator;
import matrix.entity.Matrix;
import matrix.entity.User;
import matrix.exception.BadDateException;
import matrix.exception.MatrixException;
import matrix.matrixProperties.MatrixNorm;

import java.text.SimpleDateFormat;

/*
Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов
матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
6.Вычислить норму матрицы.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Matrix p = new Matrix(2, 2);
            MatrixCreator.fillRandomized(p, -2, 2);
            MatrixNorm prop = new MatrixNorm();
            System.out.println(p + "\n first Norm: " + prop.getFirstMatrixNorm(p)
                    + "\n" + " infinite Norm: " + prop.getInfiniteMatrixNorm(p)
                    + "\n" + " Euclidean Norm: " + prop.getEuclideanMatrixNorm(p));

            Matrix q = new Matrix(3, 4);
            MatrixCreator.fillRandomized(q, 2, 7);
            System.out.println(q + "\n first Norm: " + prop.getFirstMatrixNorm(q)
                    + "\n" + " infinite Norm: " + prop.getInfiniteMatrixNorm(q)
                    + "\n" + " Euclidean Norm: " + prop.getEuclideanMatrixNorm(q));

            User user = new User("Zakrevskaya", 2022, 3, 1, 19, 2);
            System.out.println("\nAuthor: " + user.getName());
            System.out.print("The time of getting task: ");
            long getTaskTime = user.timeGettingTask();
            String taskStringDate = new SimpleDateFormat("d MMMMM yyyy HH:mm").format(getTaskTime);
            System.out.println(taskStringDate);

            System.out.print("The time of end of task: ");
            long currTime = user.timeFinishTask();
            String currStingTime = new SimpleDateFormat("d MMMMM yyyy HH:mm").format(currTime);
            System.out.println(currStingTime);

        } catch (MatrixException ex) {
            System.err.println("Error of creating matrix or number of line or column" + ex);
        } catch (BadDateException e) {
            System.out.println(e.getMessage());
        }

    }
}
