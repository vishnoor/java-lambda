package com.quest.lnd.java.excercise8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ExerciseJava8 {

    public static void main(String[] args)
    {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 53),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        //1. Sort list by Last Name;
        //Converting Anonymous Class to Lambda
        Collections.sort(people, (Person p1 , Person p2) -> {
            return p1.getLastName().compareTo(p2.getLastName());
        });

        //Type Inference
        Collections.sort(people, (p1 ,  p2) -> {
            return p1.getLastName().compareTo(p2.getLastName());
        });

        //More syntactically clean. No return and no curly braces
        Collections.sort(people, (p1 ,  p2) ->  p1.getLastName().compareTo(p2.getLastName()));



        //2. Create a method that prints all elements in the list
        System.out.println("Printing People by LastName sorted");
        printAll(people);

        //Print All is a Generic case of printAllWithCondition
        printAllWithCondition(people, (p) -> true);

        //syntactically clean . As only 1 parameter in lambda, we dont need "(p) ->" just "p ->" will suffice
        printAllWithCondition(people, p -> true);

        //3. Create a method that prints all elements with last name as 'C'
        System.out.println("\nPrinting All People with lastName C");
        printAllWithCondition(people, p -> p.getLastName().startsWith("C"));

        System.out.println("\nPrinting All People with firstName C");
        printAllWithCondition(people, p -> p.getFirstName().startsWith("C"));
    }

    private static void printAll(List<Person> people) {
        for(Person person : people)
        {
            System.out.println(person);
        }
    }

    private static void printAllWithCondition(List<Person> people, Condition condition) {
        for(Person person : people)
        {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }
    }
}

//Ideally should be in own file
interface Condition {
    boolean test(Person p);
}
