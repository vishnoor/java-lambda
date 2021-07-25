package com.quest.lnd.java.type;

public class Main {

    public static void main(String[] args) {

        StringLengthLambda lambdaWithExplicit = (String s) -> {
            return s.length();
        };

        //Show how to shorten this
        StringLengthLambda lambda = (s) -> {
            return s.length();
        };
        System.out.println(lambda.getLength("Java Lambdas"));

        //Passing a lambda to a method
        //printLambda(lambda);

        //Inline Lambda to Method
        //printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l)
    {
        System.out.println(l.getLength());
    }

    interface StringLengthLambda{
        int getLength(String s);
    }




}
