package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age = 18;

    /**
     * @param firstName - the name person entered by the user;
     * @param lastName  - the lastName person entered by the user;
     * @param age       - the age person entered by the user;
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * @return the string where person something says
     */
    public String say() {
        return new String( "My name is " + firstName + " " + lastName + " my age is " + age);
    }

    /**
     * @return the string wherein description condition person
     */
    public String move() {
        return new String(firstName + " " + lastName + " " + "move");
    }
}
