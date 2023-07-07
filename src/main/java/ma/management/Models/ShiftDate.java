package ma.management.Models;

public class ShiftDate {
    private int idDate;
    private int idOfficer;
    private int day;
    private int month;
    private int year;
    public int getIdDate() {
        return idDate;
    }
    public void setIdDate(int idDate) {
        this.idDate = idDate;
    }
    public int getIdOfficer() {
        return idOfficer;
    }
    public void setIdOfficer(int idOfficer) {
        this.idOfficer = idOfficer;
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
    public ShiftDate(int idDate, int idOfficer, int day, int month, int year) {
        this.idDate = idDate;
        this.idOfficer = idOfficer;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
}
