import java.time.chrono.JapaneseChronology;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    /* returns the number of days passed between two Dates, each month has 30 days
    complexity:
    0(2): Math.abs(int a) has one "if" check and one ternary operator.s
    *  */
    public int numOfDays(Date d){
        return Math.abs((d.getYear() * 360 + d.getMonth() * 30 + d.getDay()) - (this.getYear() * 360 + this.getMonth() * 30 + this.getDay()));
    }

    @Override
    public String toString() {
        return " <" + day + "," + month + "," + year + "> ";
    }
}

