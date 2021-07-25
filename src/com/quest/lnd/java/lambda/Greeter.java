package com.quest.lnd.java.lambda;

public class Greeter {

    public void greet(Greeting greeting)
    {
        greeting.perform();
    }

    public void greet(String greeting)
    {
        System.out.println(greeting);
    }

}
