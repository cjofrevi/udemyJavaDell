package com.acme.testing;

import com.acme.utils.MyDate;

public class PassByExperiment {

    public static void passObject(MyDate d){
        d.setYear(2009);
    }
    public static void passPrimitive(int i){
        i=2010;
    }
    public static void passString(String s){
        int yearSlash =s.lastIndexOf('/');
        s = s.substring(0, yearSlash+1);
        s += "2012";
        System.out.println("New date string: " + s);
    }

    public static void passStringBuilder(StringBuilder sb){
        String s = sb.toString();
        int yearSlash =s.lastIndexOf('/');
        sb.append(s.substring(0, yearSlash+1))
        .append("2012");
        System.out.println("New date string: " + sb);

    }


    public static void main(String[] args) {
        MyDate date = new MyDate(1,20,2008);

        System.out.println("Before passing an object " + date);
        passObject(date);
        System.out.println("After passing an object " + date);


        System.out.println("Before passing a primitive " + date.getYear());
        passPrimitive(date.getYear());
        System.out.println("After passing a primitive " + date.getYear());

        String x = date.toString();
        System.out.println("Before passing a String " + x);
        passString(x);
        System.out.println("After passing a String " + x);

        String y = date.toString();
        StringBuilder sb = new StringBuilder(date.getYear());
        System.out.println("Before passing a String " + y);
        passStringBuilder(sb);
        System.out.println("After passing a String " + y);

        System.out.println("Before passing a String " + date.getYear());
//        passStringBuilder(date.year);
        System.out.println("After passing a String " + y);
        System.out.println("Before passing a String " + date.getYear());

    }
}
