package com.resc;

public interface InterfaceTest {
    int a = 10;
    int getValue();
    default int getSquareOfValue() {
        return getValue()*getValue();
    }
}
