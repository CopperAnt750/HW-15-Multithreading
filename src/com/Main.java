package com;

public class Main {
    public static void main(String[] args) {

        PinPong pinPong = new PinPong();
        Ping ping = new Ping(pinPong);
        Pong pong = new Pong(pinPong);
        Thread pingThread = new Thread(ping);
        Thread pongThread = new Thread(pong);

        pingThread.start();
        pongThread.start();


    }
}
