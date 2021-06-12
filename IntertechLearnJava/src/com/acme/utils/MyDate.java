package com.acme.utils;

public class MyDate {

    private byte day;
    private  short year;
    private  byte month;


    public MyDate() {
        this(1,1,1900);
    }

    public MyDate(int month, int day, int year) {
        setDate(month, day, year);
    }

    public void setDate(int month,  int day, int year) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
        }else {
            return;
        }
        this.year = (short) year;
        this.month =  (byte) month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = (short) year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = (byte) month;
    }


    public static void leapYears() {
// ...your code here to compute and println the leap years.
        int yearLeap = 1752;
        while(yearLeap <= 2020){
            if( yearLeap % 100 == 00){
                yearLeap += 4;
                continue;
            }
            yearLeap += 4;
            System.out.println(yearLeap+" is a leap year");
        }
    }

    private boolean valid(int day, int month, int year){
        if (day > 31 || day < 1 || month > 12 || month < 1 ){
            System.out.println("Attempting to create a non-valid date "
                    + month + "/" + day + "/" + year);
            return false;
        }
        switch (month){
            case 4:
            case 6:
            case 9:
            case 11: return (day <= 30);
            case 2: return day <= 28 || ( day == 29 && year % 4 == 0) ;
        }
        return true;
    }

    @Override
    public String toString() {
        return  month + "/"+ day +"/" + year;
    }
}
