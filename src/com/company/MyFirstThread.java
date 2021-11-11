package com.company;

public class MyFirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("Ping");
    }
}
