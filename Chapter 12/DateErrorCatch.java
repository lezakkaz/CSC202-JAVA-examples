/*
In this implementation, the constructor throws an IllegalArgumentException if the day or month values are not between 1 and 31 or 1 and 12, respectively. The setters for the day and month fields also check for validity and throw an exception if necessary. The year field is left unchecked, as it can be any positive integer. The toString() method simply returns a string representation of the date in the format "day/month/year".
*/

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) throws IllegalArgumentException {
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid day or month value.");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // getters and setters
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Invalid day value.");
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month value.");
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
