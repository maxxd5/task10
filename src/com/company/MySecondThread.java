package com.company;

public class MySecondThread extends Thread {

    @Override
    public void run() {
        System.out.println("Pong");
    }
}
