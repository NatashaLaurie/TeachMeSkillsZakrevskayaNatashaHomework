package matrix.valid;

/**
 * Class {@code PositiveIntValid} is designed for validation of positive integer
 * Created by HP on 01.03.2022.
 *
 * @author Zakrevskaya Nataliya
 * @version 1.0
 */
public class PositiveIntValid {

    /**
     * Validation of size
     *
     * @param i - size of matrix
     * @return {@code true} if size is valid
     * and {@code false} otherwise.
     */
    public static boolean isValidSize(int i) {
        return i > 0;
    }
}
