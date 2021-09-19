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

    public String say() {
        return new String(firstName + " " + lastName + " age " + age + " said: " + say);
    }

    public String move() {
        return new String(firstName + " " + lastName + " " + "move");
    }
}
