public class BirthDay {
    private int day;
    private int month;
    private int year;

    public BirthDay(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        if(day > 0 && day <= 31) {
            this.day = day;
        }
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if(month > 0 && month <= 12) {
            this.month = month;
        }
    }

    public int getMonth() {
        return month;
    }
    public void setYear(int year) {
        if(year > 1900 && year <= 2022) {
            this.year = year;
        }
    }

    public int getYear() {
        return year;
    }
    public String toString() {
        return getDay() + "." + getMonth() + "." + getYear();
    }
}