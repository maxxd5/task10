package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            MyFirstThread thread = new MyFirstThread();
            MySecondThread thread1 = new MySecondThread();
            thread.start();
            thread1.start();
        }
    }
}
