package com.quest.lnd.java.functionalinterface;

public class Main {

    public static void main(String[] args) {

        Thread lambdaThread = new Thread(() -> System.out.println("From Lambda Thread"));
        lambdaThread.run();

    }






}
