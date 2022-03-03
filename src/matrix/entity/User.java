package matrix.entity;

import matrix.exception.BadDateException;
import matrix.valid.DateValid;

import java.util.GregorianCalendar;

/**
 * Class {@code DateValid} is designed for validation of date
 * Created by HP on 01.03.2022.
 *
 * @author Zakrevskaya Nataliya
 * @version 1.0
 */
public class User {
    private final String name;
    private final int year;
    private final int month;
    private final int date;
    private final int hourOfDay;
    private final int minute;

    /**
     * Constructor of class
     *
     * @param name      the name of user
     * @param year      the year of the date of getting of the task
     * @param month     the month of the date of getting of the task
     * @param date      the day of the date of the task
     * @param hourOfDay the hour Of Day of date of getting of the task
     * @param minute    the minute of the date of getting of the task
     * @throws BadDateException if the date ia bad then
     *                          throw this exception to indicate that an instance cannot create
     */
    public User(String name, int year, int month, int date, int hourOfDay, int minute) throws BadDateException {
        this.name = name;
        if (DateValid.isValidDate(year, month, date) && DateValid.isValidHour(hourOfDay) && DateValid.isValidMinute(minute)) {
            this.year = year;
            this.month = month - 1;
            this.date = date;
            this.hourOfDay = hourOfDay;
            this.minute = minute;
        } else {
            throw new BadDateException("Bad date in creating User");
        }

    }

    /**
     * Returns the field value name
     *
     * @return field value name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the time of getting task of student
     *
     * @return the time of getting task in long
     */
    public long timeGettingTask() {
        GregorianCalendar calendarGetTasks = new GregorianCalendar();
        calendarGetTasks.set(year, month, date, hourOfDay, minute);

        return calendarGetTasks.getTimeInMillis();
    }

    /**
     * Returns the time of finishing task of student
     *
     * @return the time of finishing task in long
     */
    public long timeFinishTask() {
        GregorianCalendar currentCalendar = new GregorianCalendar();
        return currentCalendar.getTimeInMillis();
    }
}

