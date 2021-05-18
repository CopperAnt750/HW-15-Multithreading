package com;

public class Main {
    public static void main(String[] args) {
        PingPong pingPong = new PingPong();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    pingPong.m("Ping");
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    pingPong.m("Pong");
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
