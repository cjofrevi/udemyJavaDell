package com.company;

interface Calculator{
    void add(int num1, int num2);
}
class Calc{
    public static void addSomething(int num1, int num2){
        System.out.println(num1 + " and  " + num2+ " adiition is: "+(num1+num2));
    }

    public  void letsAdd(int num1, int num2){
        System.out.println(num1 + " and  " + num2+ " adds to: "+(num1+num2));
    }

}
interface Messenger {
    Message getMessage(String mgs);
}

class Message{
    Message(String mgs){
        System.out.println(">> Message is: "+mgs);
    }

}

public class MethodReferenceApp {

    public static void main(String[] args) {
//        Calc.addSomething(10, 20);
//        Calculator cRef = Calc::addSomething;
//        cRef.add(11, 14);

//        Calc calc = new Calc();
//        Calculator cRef = calc::letsAdd;
//        cRef.add(15, 14);

        Messenger mReg = Message::new;
        mReg.getMessage("nino el felino");

    }
}
