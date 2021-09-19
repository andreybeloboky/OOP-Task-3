package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age = 18;
    private String say;

    public Person(String firstName, String lastName, int age, String say) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.say = say;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
