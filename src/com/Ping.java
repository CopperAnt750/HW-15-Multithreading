package com;

public class Ping implements Runnable {

    PinPong game;
    String msg = "Ping";

    public Ping(PinPong game) {
        this.game = game;
    }

    @Override
    public void run() {
        final String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started ... ");


        for (int i = 0; i < 2; i++) {
            game.print(msg);
            System.out.println(threadName + " is working ... ");
        }

    }
}
