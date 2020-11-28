package com.resc;

public class Parent {

    public String msg = "Parent field";

    public void printMsg() {
        System.out.println("Parent method");
    }

    public void printMsg2(){
        System.out.println("Parent method - " + this.msg);
    }
}
