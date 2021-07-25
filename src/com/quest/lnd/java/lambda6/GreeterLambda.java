package com.quest.lnd.java.lambda6;

import java.util.function.Consumer;

public class GreeterLambda {
    Consumer<String> greet = (String message) -> {System.out.println(message);};
}
