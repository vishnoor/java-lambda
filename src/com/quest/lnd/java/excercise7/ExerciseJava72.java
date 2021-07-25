package com.quest.lnd.java.excercise7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ExerciseJava72 {

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
        Collections.sort(people, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2){
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        //2. Create a method that prints all elements in the list
        System.out.println("Printing People by LastName sorted");
        printAll(people);

        //3. Create a method that prints all elements with last name as 'C'
        System.out.println("\nPrinting All People with lastName C");
        printAllWithCondition(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("\nPrinting All People with firstName C");
        printAllWithCondition(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });
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
