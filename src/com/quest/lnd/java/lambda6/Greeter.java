package com.quest.lnd.java.lambda6;

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
