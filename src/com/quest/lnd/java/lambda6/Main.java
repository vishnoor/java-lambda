package com.quest.lnd.java.lambda6;

import com.quest.lnd.java.lambda.Greeter;

public class Main {

    public static void main(String[] args) {

        //MyLambda myGreetingLambda = () -> System.out.println("Hello World");
        //myGreetingLambda.greet();

        MyAdder myAdder = (int a, int b) -> a + b;

        MySafeDivider mySafeDivider = (int a, int b ) -> {
            if (b == 0)
            {
                return 0;
            }
            else
            {
                return a/ b;
            }
        };

        //Greeting myGreetingLambda = () -> System.out.println("Hello World");
        //myGreetingLambda.perform();

        myAdder.add(2 , 10);
    }

    interface MyLambda{
        void greet();
    }

    interface MyAdder {
        int add(int a , int b);
    }

    interface MySafeDivider{
        int divide(int a, int b);
    }


}
