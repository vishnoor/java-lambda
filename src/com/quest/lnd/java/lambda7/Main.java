package com.quest.lnd.java.lambda7;

public class Main {

    public static void main(String[] args) {

        //lambda greeter
        Greeting myGreetingLambda = () -> System.out.println("Hello World");
        myGreetingLambda.perform();

        //Anonymous Inner Class
        Greeting anonClassGreeter = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        };
        anonClassGreeter.perform();
    }




}
