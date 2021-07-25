package com.quest.lnd.java.runnable;

import sun.awt.windows.ThemeReader;

public class Main {

    public static void main(String[] args) {
        Thread anonThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("From Anonymous Thread");
            }
        });

        anonThread.run();

        Thread lambdaThread = new Thread(() -> System.out.println("From Lambda Thread"));
        lambdaThread.run();

    }






}
