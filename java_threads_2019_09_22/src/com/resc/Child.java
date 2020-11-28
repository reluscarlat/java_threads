package com.resc;

public class Child extends Parent{

    public String msg = "Child field";

    public void printMsg() {
        System.out.println("Child method");
    }

    public void printMsg2() {
        System.out.println("Child method - " + this.msg);
    }
}
