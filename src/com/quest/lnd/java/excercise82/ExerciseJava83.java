package com.quest.lnd.java.excercise82;

import com.quest.lnd.java.excercise8.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class ExerciseJava83 {

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
        Collections.sort(people, (p1 ,  p2) ->  p1.getLastName().compareTo(p2.getLastName()));

        //2. Create a method that prints all elements in the list
        System.out.println("Printing People by LastName sorted");
        //Print All is a Generic case of printAllWithCondition
        printAllWithCondition(people, p -> true, p -> System.out.println(p));

        //3. Create a method that prints all elements with last name as 'C'
        System.out.println("\nPrinting All People with lastName C");
        printAllWithCondition(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        System.out.println("\nPrinting All People with firstName C");
        printAllWithCondition(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
    }

    private static void printAllWithCondition(List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
        for(Person person : people)
        {
            if (condition.test(person)) {
                consumer.accept(person);
            }
        }
    }
}

