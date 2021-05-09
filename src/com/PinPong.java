package com;

public class PinPong {

    private boolean flag = true;

    public synchronized void print(String msg) {
        System.out.println(msg);
        try {
            notifyAll();
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
