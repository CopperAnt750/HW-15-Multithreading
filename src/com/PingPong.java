package com;

public class PingPong {
    String massage;

    synchronized void m(String msg) {
        this.massage = msg;
        try {
            Thread.sleep(333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(massage);
    }
}
