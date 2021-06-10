package com.acme.utils;

public class MyDate {

    public int day;
    public int year;
    public int month;

    public MyDate() {
        day = 1;
        month = 1;
        year = 2000;
    }

    public MyDate(int month, int day, int year) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public void setDate(int month,  int day, int year) {
        this.day = day;
        this.year = year;
        this.month = month;
    }


    @Override
    public String toString() {
        return  month + "/"+ day +"/" + year;
    }
}
