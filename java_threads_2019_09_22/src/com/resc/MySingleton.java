package com.resc;

public enum MySingleton {
    INSTANCE;
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
