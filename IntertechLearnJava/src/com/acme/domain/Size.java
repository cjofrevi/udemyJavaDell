package com.acme.domain;

public enum Size {
    S('S', 0.0),
    M('M',0.01),
    L('L',0.02),
    X('X',0.03);

    private final char day;
    private final double discount;

    Size(char day, double discount) {
        this.day = day;
        this.discount = discount;
    }

    public char getDay() {
        return day;
    }

    public double getDiscount() {
        return discount;
    }

    public static Size getSizeEnum(char c){

        Size size = null;
        switch(c){
            case 'S':
                size = Size.S;
                break;
            case 'M':
                size = Size.M;
                break;
            case 'L':
                size = Size.L;
                break;
            case 'X':
                size = Size.X;
                break;
            default:
        }
        return size;
    }
}
