package matrix.valid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValid {
    /**
     * @param year  the year of the date of getting the task
     * @param month the month of the date of getting the task
     * @param date  the day of the date of getting the task
     * @return {@code true} if date is valid
     * and {@code false} otherwise.
     */
    public static boolean isValidDate(int year, int month, int date) {
        //https://dzone.com/articles/techtip-use-setlenient-method
        //http://voituk.kiev.ua/2007/08/23/java-date-parse/
        //http://bugs.java.com/view_bug.do?bug_id=4880502
        String dateStr = date + "/" + month + "/" + year;
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/MM/yyyy");
        sdf.setLenient(false); //https://dzone.com/articles/techtip-use-setlenient-method
        try {
            Date d = sdf.parse(dateStr); //Если успешно распарсится, то дата валидна
        } catch (ParseException e) {
            //may output in logger
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * Validation of time     *
     *
     * @param min minute of getting the task
     * @return {@code true} if minute is valid
     * and {@code false} otherwise.
     */
    public static boolean isValidMinute(int min) {
        return ((min > 0) && (min <= 60));
    }

    /**
     * Validation of time     *
     *
     * @param hour hour of getting the task
     * @return {@code true} if hour is valid
     * and {@code false} otherwise.
     */
    public static boolean isValidHour(int hour) {
        return ((hour >= 0) && (hour <= 23));
    }
}


