package com.resc;

public class Printer3 extends Thread {
    private int[] arr;
    private int left;
    private int right;

    public Printer3(int[] arr, int left, int right) {
        this.arr = arr;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        for(int i = left; i <= right; i++) {
            arr[i] = i;
        }
    }
}
